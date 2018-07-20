package com.bigdata.actors

/**
  * Created with IDEA by User1071324110@qq.com on 2018/7/19
  *
  * @author 10713
  *
  */
object MyActor01 {

  def main(args: Array[String]): Unit = {
    val lines = Array("hello tom", "hello kitty", "hello tom cjk", "hello tom")
    println(lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1))
  }

}
