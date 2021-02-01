package com.sov.anik.leetcode;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode();
        ListNode ln0 = new ListNode(0, ln);
        int c= 0;

        while(l1.next != null && l2.next != null) {
            //System.out.println(l1.val + " + " + l2.val + " + " + c);
            //System.out.println("deb " + (l1.val + l2.val  + c)%10);

            //ln.val = (l1.val + l2.val  + c)%10;
            ln.next = new ListNode((l1.val + l2.val  + c)%10);
            ln = ln.next;
            if (l1.val + l2.val  + c > 9) {
                c = 1;
            } else {
                c= 0;
            }
            l1 = l1.next;
            l2 = l2.next;

        };
        //System.out.println(l1.val + " + " + l2.val + " + " + c);
        //System.out.println("deb " + (l1.val + l2.val  + c)%10);

        //ln.val = (l1.val + l2.val  + c)%10;
        ln.next = new ListNode((l1.val + l2.val  + c)%10);
        ln = ln.next;
        if (l1.val + l2.val + c> 9) {
            c = 1;
        } else {
            c= 0;
        }

        while(l2.next != null) {
            l2 = l2.next;

            //System.out.println(l2.val + " + " + c);
            //System.out.println("deb " + (l2.val + c)%10);

            //ln.val = (l2.val + c)%10;
            ln.next = new ListNode((l2.val + c)%10);
            ln = ln.next;
            if(l2.val+c > 9) {
                c = 1;
            } else {
                c = 0;
            }
        }

        //System.out.println(l2.val);

        while(l1.next != null) {
            l1 = l1.next;
            //System.out.println(l1.val + " + " + c);
            //System.out.println("deb " + (l1.val + c)%10);

            //ln.val = (l1.val + c)%10;
            ln.next = new ListNode((l1.val + c)%10);
            ln = ln.next;
            if(l1.val + c > 9) {
                c = 1;
            } else {
                c = 0;
            }
        };


        if (c > 0) {
            //System.out.println("deb " + c);
            ln.next = new ListNode(c);
            ln = ln.next;
        }

        return ln0.next.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers aTN = new AddTwoNumbers();

        //[9,9,9,9,9,9,9]
        //[9,9,9,9]
//        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9,new ListNode(9)))))));
//        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        //[8,9,9,9,0,0,0,1]

//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        //ListNode l1 = new ListNode(0);
        //ListNode l2 = new ListNode(0);

        ListNode l1 = new ListNode(3, new ListNode(7));
        ListNode l2 = new ListNode(9, new ListNode(2));

        ListNode result = aTN.addTwoNumbers(l2, l1);
        ListNode.out(result);


    }


}
