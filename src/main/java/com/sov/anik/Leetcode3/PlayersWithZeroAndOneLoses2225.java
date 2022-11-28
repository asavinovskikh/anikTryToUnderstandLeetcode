package com.sov.anik.Leetcode3;

import com.sov.anik.leetcode.Utils;

import java.util.*;

public class PlayersWithZeroAndOneLoses2225 {
    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> players = new HashSet<>();
        Set<Integer> losers = new HashSet<>();
        Set<Integer> onseLosers = new HashSet<>();
        Set<Integer> winners = new HashSet<>();

        for(int [] a : matches) {
            players.add(a[0]);
            winners.add(a[0]);

            players.add(a[1]);
            if (!losers.contains(a[1])) {
                losers.add(a[1]);
                onseLosers.add(a[1]);
            } else {
                onseLosers.remove(a[1]);
            }
        }
        winners.removeAll(losers);

        List<Integer> win = new ArrayList<>(winners);
        Collections.sort(win);
        Utils.printArray(win.toArray());

        List<Integer> los = new ArrayList<>(onseLosers);
        Utils.printArray(los.toArray());
        Collections.sort(los);

        result.add(win);
        result.add(los);
        return result;
    }

    public static void main(String[] args) {
        int[][] a = new int[][] {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        findWinners(a);
    }
}
