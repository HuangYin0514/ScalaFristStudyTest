package com.bigdata


class Person {
  val id ="9527"
  var name:String ="唐伯虎"
  private var sex = "男"
  private [this] var addr = "东北"

  def m(): String ={
    addr = "西南"
    addr
  }

}

/**
  * 伴生对象 ： 名字与class相同， 且在一个文件中
  */
object Person{
  def main(args: Array[String]): Unit = {
    val p = new Person
    println(p.id)
    println(p.name)
    p.name = "秋香"
    println(p.name)
    p.sex = "女"
    println(p.sex)
  }

}

object Test{
  def main(args: Array[String]): Unit = {
    val p = new Person
    val addr = p.m()
    println(addr)
  }

}
