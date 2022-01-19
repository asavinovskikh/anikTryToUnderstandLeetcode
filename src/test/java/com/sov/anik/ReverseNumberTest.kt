//package com.sov.anik
//
//
//class AppTest {
////    @Test
////    fun thingsShouldWork() {
////        assertEquals(listOf(1,2,3).reversed(), listOf(3,2,1))
////    }
////
////    @Test
////    fun thingsShouldBreak() {
////        assertEquals(listOf(1,2,3).reversed(), listOf(1,2,3))
////    }
////
////    @Test
////    fun thingsShouldOk() {
////        assertEquals(reverseInt(123), 321)
////    }
////
////    @Test
////    fun thingsShouldOk2() {
////        assertEquals(reverseInt(-123), -321)
////    }
////
////
////    @Test
////    fun thingsShouldOk3() {
////        assertEquals(reverseInt(-120), -21)
////    }
////
////    @Test
////    fun thingsShouldOk4() {
////        assertEquals(reverseInt(9646324351.toInt()), 0)
////    }
//
//    private fun reverseInt(x: Int): Int {
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
////2 147 483 647
////9 579 836 501
//
//    }
//}
//
