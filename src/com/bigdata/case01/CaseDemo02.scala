package com.bigdata.case01

import scala.util.Random

/**
  * Created with IDEA by User1071324110@qq.com on 2018/7/19
  *
  * @author 10713
  *
  */
object CaseDemo02 extends App {

  val arr = Array("hello", 1, -2.0, CaseDemo02)
  val elem = arr(2)
  //  println(elem)

  elem match {
    case x: Int => println(s"Int $x")
    case x: String => println(s"String $x")
    case x: Double if (x >= 0) => println(s"String $x")
    case CaseDemo02 => {
      println(s"CaseDemo02")
    }
    case _ => println("default")
  }

}
