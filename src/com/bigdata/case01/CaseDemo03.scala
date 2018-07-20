package com.bigdata.case01

/**
  * Created with IDEA by User1071324110@qq.com on 2018/7/19
  *
  * @author 10713
  *
  */
object CaseDemo03 extends App {
  /*
    val arr = Array(3,3,4,4,4)
    arr match {
      case Array(1,x,y,z) => println("case01")
      case Array(1,3,y,z) => println("case02")
      case Array(3,_*) => println("case03")
      case _ => println("default")
    }
  */

  val lst1 = 9.0000 :: (5 :: (2 :: Nil))
  val lst2 = 9 :: 5 :: 2 :: List()
  val lst3 = Array(9, 5, 2, Nil)
  println(lst1)
  println(lst2)
  println(lst1 == lst2)
  println(lst1 == lst3)

  /* val lst = List(0, 1, 3)
   println(lst.head)
   println(lst.tail)*/

  /*  lst match {
      case  0::Nil => println("case1")
      case  x::y :: Nil => println("case2")
      case  0 :: a => println(s"case3 $a")
      case _ => println("default")
    }*/

  /*  val tup = (1.2, 2, 3)
    tup match {
      case (1, x, y) => println(s"case01 $x,$y")
      case (_, _, y) => println(s"case02 $y,$y")
      case _ => println("default")
    }*/

  println(1.0 == 1 + s"  1.0 == 1")
}
