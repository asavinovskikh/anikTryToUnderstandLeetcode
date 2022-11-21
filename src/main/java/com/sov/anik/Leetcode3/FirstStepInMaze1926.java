package com.sov.anik.Leetcode3;

import java.util.Objects;
import java.util.Stack;

import static java.lang.Math.min;

public class FirstStepInMaze1926 {

    //Обычный BFS  - Есть матрица в которой задана некая территория
    //По ней есть маршруты - задана точка входа. надо найти кратчайшую точку выхода
    //Или сказать что такой точки не существует
    public int nearestExit(char[][] maze, int[] entrance) {
        int result = -1;
        Stack<Coordinates> stack = new Stack<>();
        Coordinates c = new Coordinates(entrance[0], entrance[1]);
        if (c.getX() + 1 < maze[0].length && maze[c.getX()+1][c.getY()] == '.') {
            stack.push(c);
        }
        if (c.getX() - 1 >=0 && maze[c.getX()-1][c.getY()] == '.') {
            stack.push(c);
        }
        if (c.getY() + 1 < maze.length && maze[c.getX()][c.getY() + 1] == '.') {
            stack.push(c);
        }
        if (c.getY() - 1 >= 0 && maze[c.getX()][c.getY() -1] == '.') {
            stack.push(c);
        }
        maze[entrance[0]][entrance[1]] = '+';
        result = bfs(maze, stack, c, 0, true);
        if (result == Integer.MAX_VALUE) {
            result = -1;
        }
        return result ;
    }

    public int bfs(char[][] maze, Stack<Coordinates> stack, Coordinates prev, int len, boolean isFirst) {
        if (stack.empty()) {
            return isOut(prev, maze) ? len +1 : -1;
        }

        Coordinates c = stack.pop();
        maze[prev.getX()][prev.getY()] = '-';

        if (c.getX() + 1 < maze[0].length && maze[c.getX()+1][c.getY()] == '.') {
            Coordinates newc = new Coordinates(c.getX() +1, c.getY());
            if(prev.isEq(newc)) {
                stack.push(newc);
            }
        }
        if (c.getX() - 1 >=0 && maze[c.getX()-1][c.getY()] == '.') {
            Coordinates newc = new Coordinates(c.getX() -1, c.getY());
            if(prev.isEq(newc)) {
                stack.push(newc);
            }
        }
        if (c.getY() + 1 < maze.length && maze[c.getX()][c.getY() + 1] == '.') {
            Coordinates newc = new Coordinates(c.getX(), c.getY() + 1);
            if(prev.isEq(newc)) {
                stack.push(newc);
            }
        }
        if (c.getY() - 1 >= 0 && maze[c.getX()][c.getY() -1] == '.') {
            Coordinates newc = new Coordinates(c.getX(), c.getY() - 1);
            if(prev.isEq(newc)) {
                stack.push(newc);
            }
        }

        return bfs(maze, stack, c, len, false)+1;
    }

    public static boolean isOut(Coordinates curr, char[][] maze) {
        if (maze[curr.getX()][curr.getY()]== '+')
            return false;

        if (curr.getX() + 1 > maze[0].length)
            return true;
        if (curr.getX() - 1 >= 0)
            return true;
        if (curr.getY() + 1 > maze.length)
            return true;
        if (curr.getY() - 1 >= 0)
            return true;
        return false;
    }

    class Coordinates{
        int x;
        int y;
        Coordinates(int a, int b) {
            x = a;
            y = b;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public boolean isEq(Coordinates another) {
            if ((another.getX() == this.getX())
                    && (another.getY() == this.getY())) {
                return true;
            }
            return false;
        }

        public int[] toArr() {
            int[] a = new int[2];
            a[1] = getX();
            a[0] = getY();
            return a;
        }
    }

    //bugExist todo fix it!
    public static void main(String[] args) {
        FirstStepInMaze1926 f = new FirstStepInMaze1926();

//        char [][] array = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
//        int [] entr = new int [] {1,0};
//         System.out.println(f.nearestExit(array, entr));

        char [][] array = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int [] entr2 = new int [] {1,2};
        System.out.println(f.nearestExit(array, entr2)); //need 1

//        char [][] array = {{'+','+','+'},{'.','.','.'},{'+','+','+'}};
//        int [] entr = new int [] {1,0};
//        System.out.println(f.nearestExit(array, entr)); //need 2

    }
}
