package com.sov.anik.leetcode;

//for addTwoNumbers
public class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   static void out(ListNode l) {
       while(l.next != null) {
           System.out.print(l.val + " ");
           l = l.next;
       }
       System.out.print(l.val);
   }
}
