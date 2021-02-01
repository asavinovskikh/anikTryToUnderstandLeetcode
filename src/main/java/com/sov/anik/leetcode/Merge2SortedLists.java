package com.sov.anik.leetcode;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class Merge2SortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        int current = 0;

        ListNode res = new ListNode(current);

        return res;
    }

    public static void main(String[] args) {
        Merge2SortedLists msl = new Merge2SortedLists();
        ListNode l1 = new ListNode(3, new ListNode(7));
        ListNode l2 = new ListNode(2, new ListNode(9));

        ListNode result = msl.mergeTwoLists(l2, l1);
        ListNode.out(result);
    }
}
