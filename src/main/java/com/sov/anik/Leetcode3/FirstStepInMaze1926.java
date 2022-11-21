package com.sov.anik.Leetcode3;

import java.util.Objects;
import java.util.Stack;

public class FirstStepInMaze1926 {

    //Обычный BFS  - Есть матрица в которой задана некая территория
    //По ней есть маршруты - задана точка входа. надо найти кратчайшую точку выхода
    //Или сказать что такой точки не существует
    public int nearestExit(char[][] maze, int[] entrance) {
        int result = -1;
        Stack<Coordinates> stack = new Stack<>();
        maze[entrance[0]][entrance[1]] = '-';
        result = bfs(maze, entrance, maze.length, maze[0].length, 0, stack);
        if (result == Integer.MAX_VALUE) {
            result = -1;
        }
        return result;
    }

    public int bfs(char[][] maze, int[] en, int k, int n, int len, Stack<Coordinates> prepare) {
            if (en[1] + 1 < n) {
                    if(maze[en[0]][en[1] + 1] =='.') {
                        prepare.push(new Coordinates(en[0], en[1] + 1));
                    }
               } else {
                return maze[en[0]][en[1]] !='+' ? len : -1;
            }
               if (en[1] -1 >= 0) {
                   if(maze[en[0]][en[1] - 1] =='.') {
                       prepare.push(new Coordinates(en[0], en[1] - 1));
                   }
               } else {
                   return maze[en[0]][en[1]] !='+' ? len : -1;
               }
               if (en[0] + 1 < k) {
                   if(maze[en[0] + 1][en[1]] =='.') {
                       prepare.push(new Coordinates(en[0] + 1, en[1]));
                   }
               } else {
                   return maze[en[0]][en[1]] !='+' ? len : -1;
               }

               if (en[0] -1 >= 0) {
                   if(maze[en[0] - 1][en[1]] =='.') {
                       prepare.push(new Coordinates(en[0] - 1, en[1]));
                   }
               } else {
                   return maze[en[0]][en[1]] !='+' ? len : -1;
               }
               int minRes = Integer.MAX_VALUE;
            while(!prepare.empty()) {
                Coordinates co = prepare.pop();
                maze[en[0]][en[1]] = '-';
                int res = bfs(maze, co.toArr(), k,n, len + 1, prepare);
                if (res < minRes) {
                    minRes = res;
                }
            }
            return minRes;
    }

    public static void main(String[] args) {
        char [][] array = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int [] entr = new int [] {1,0};
        FirstStepInMaze1926 f = new FirstStepInMaze1926();
        System.out.println(f.nearestExit(array, entr));
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

        public int[] toArr() {
            int[] a = new int[2];
            a[1] = getX();
            a[0] = getY();
            return a;
        }
    }
}
