package com.sov.anik.leetcode;

public class ListNodeReverseList206 {
        public static ListNode reverseList(ListNode head) {
            ListNode newHead = null;

            while(head != null){
                ListNode futr = head.next;
                head.next = newHead;
                newHead = head;
                head = futr;
            }

            return newHead;
        }

        public static ListNode reverse2(ListNode head){
            return reverseListRecursion(head, null);
        }

        public static ListNode reverseListRecursion(ListNode head, ListNode newHead) {
            if (head == null) {
                return newHead;
            }
            ListNode next = head.next;
            head.next = newHead;
            return reverseListRecursion(next, head);
        }
}
