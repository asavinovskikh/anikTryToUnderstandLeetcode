package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.ListNodeReverseList206.reverse2;

class ListNodeReverseList206Test {

    @Test
    public void listNodeReverseTest(){
        ListNode l1 = new ListNode(3, new ListNode(7, new ListNode(5)));
        ListNode l2 = new ListNode(9, new ListNode(2));

        ListNode result = reverse2(l2);
        ListNode.out(result);

        ListNode result1 = reverse2(l1);
        ListNode.out(result1);
    }

}