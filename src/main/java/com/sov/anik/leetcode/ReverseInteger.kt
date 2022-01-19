//package com.sov.anik.leetcode
//
//import com.sun.tools.javac.util.Assert
//
//
////https://leetcode.com/problems/reverse-integer/
//class ReverseInteger {
//    fun reverseInt(x: Int): Int {
//        var boo : Boolean = x<0
//
//        var y:String = x.toString()
//        var z:String = y.removePrefix("-").reversed()
//        var W: Int
//        try {
//            W = z.toInt()
//        } catch (nfe: NumberFormatException) {
//            W = 0
//        }
//
//        if (boo) {
//            return -1* W;
//        }
//        return W;
//    }
//
//
//    @Test
//    fun thingsShouldOk4() {
//        Assert.assertEquals(reverseInt(9646324351.toInt()), 0)
//    }
//
//    @Test
//    fun thingsShouldOk() {
//        Assert.assertEquals(reverseInt(123), 321)
//    }
//
//    @Test
//    fun thingsShouldOk2() {
//        Assert.assertEquals(reverseInt(-123), -321)
//    }
//
//
//    @Test
//    fun thingsShouldOk3() {
//        Assert.assertEquals(reverseInt(-120), -21)
//    }
//
//
//
//
//
//
//}