package com.bigdata

/**
  * Created with IDEA by User1071324110@qq.com
  *
  * @author 10713
  */
object ApplyDemo {

  var name:String = "123"

  /*def apply(): Unit ={
    println("空参数")
  }*/

  def apply(s:String):String={
    println("String参数")
    s
  }


  def apply(s:Int):Int={
    println("Int参数")
    s
  }

  def main(args: Array[String]): Unit = {
    val demo = ApplyDemo.name ="34"
    val p1 = ApplyDemo(1)
    val p2 = ApplyDemo("1")
    ApplyDemo.name ="54"
    println(ApplyDemo.name)
  }

}
