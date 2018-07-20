package com.bigdata

/**
  * Created with IDEA by User1071324110@qq.com
  *
  */
object HelloWorld {

  def m1(f: Int => Int): Unit = {
    val r = f(20)
    println(r)
  }

  val f: (Int) => (Int) = x => x * x
  val f1 = (x: Int) => x * x * x

  def m2(x: Int): Int = {
    x * x * x * x
  }

  def main(args: Array[String]) {
    /* println("hello world")
     println("abc")
     val b = for (a <- 1 until 10; b <- 2 to 10 if a < 4; if b != 2) yield a
     println(b)*/
    //    m1(x => x * x)
    m1(f)
    m1(f1)
    m1(m2)
    m1(m2 _)
    m1(x => m2(x))



  }

}
