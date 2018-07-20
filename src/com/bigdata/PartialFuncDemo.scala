package com.bigdata

/**
  * Created with IDEA by User1071324110@qq.com on 2018/7/19
  *
  * @author 10713
  *
  */
object PartialFuncDemo {
  def func1: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
    case _ => 0
  }

  def func2(num: String): Int = {
    num match {
      case "one" => 1
      case "two" => 2
      case _ => 0
    }
  }

  def main(args: Array[String]): Unit = {
    println(func1("one"))
    println(func2("two"))


  }
}
