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
//        ListNode l1 = new ListNode(3, new ListNode(7));
//        ListNode l2 = new ListNode(2, new ListNode(9));
//
//        ListNode result = msl.mergeTwoLists(l2, l1);


        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2,new ListNode(4)))));
        ListNode result = msl.oddEvenList(l1);
        ListNode.out(result);
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = new ListNode();
        ListNode even = new ListNode();
        ListNode iter = head.next.next;
        ListNode clear = head;
//
        odd = head;
        even = head.next;

        ListNode iterOdd = odd;
        ListNode iterEven = even;

        int two = 3;
        while(iter != null) {
            if (two %2 ==1) {
                odd.next = iter;
            } else {
                even.next = iter;
            }
            two++;
            iter = iter.next;
        }

        ListNode result = clear;
        ListNode headResult = result;

        while(iterOdd!= null) {
            result.next = iterOdd;
            iterOdd = iterOdd.next;
        }
        while (iterEven != null) {
            result.next = iterEven;
            iterEven = iterEven.next;
        }

        return headResult.next;
    }

    public ListNode oddEvenList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next.next, odd = head, even = head.next, evenhead = even;
        int i = 3;
        while (temp != null) {
            if (i % 2 != 0) {
                odd.next = temp;
                odd = odd.next;
            } else {
                even.next = temp;
                even = even.next;
            }
            temp = temp.next;
            i++;
        }
        if (i % 2 == 0) {
            even.next = odd.next;
        }
        odd.next = evenhead;
        return head;
    }
}
