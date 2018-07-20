package com.bigdata.case01

import scala.util.Random

/**
  * Created with IDEA by User1071324110@qq.com on 2018/7/19
  *
  * @author 10713
  *
  */
object CaseDemo01 extends App {
  val arr = Array("YoshizawaAkiho", "YuiHatano", "AoiSola")
  val name = arr(Random.nextInt(arr.length))
  println(name)
  name match {
    case "YoshizawaAkiho" => println("吉泽老师")
    case "YuiHatano" => println("波多老师")
    case _ => println("不知道说的是谁")
  }

}
