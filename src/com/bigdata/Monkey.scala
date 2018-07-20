package com.bigdata

/**
  * Created with IDEA by User1071324110@qq.com
  *
  * @author 10713
  */
class Monkey extends Animal with Flyable with Eatable {

  override def aaa(): String = {
    1 + ""
  }

  override def fly(): Unit = {
    println("扇翅膀")
  }

  override def eat(): Unit = {
    println("用筷子")

  }

  /*
     override def run(): Unit = {

     }*/
}

object Monkey {
  def main(args: Array[String]): Unit = {
    val monkey = new Monkey
    monkey.eat()
  }
}
