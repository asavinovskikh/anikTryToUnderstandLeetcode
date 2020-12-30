package com.sov.anik.leetcode;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ln = new ListNode();
            ListNode next = null;

            ln.val = l1.val + l2.val;
            ListNode nextl1 = l1.next;

            while(nextl1 != null) {
                ListNode nextl2 = l2.next;
                
            }

            return ln;
        }



}
class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
