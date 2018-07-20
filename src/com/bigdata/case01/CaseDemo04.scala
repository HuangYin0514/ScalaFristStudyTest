package com.bigdata.case01

import scala.util.Random

/**
  * Created with IDEA by User1071324110@qq.com on 2018/7/19
  *
  * @author 10713
  *
  */
case class SubmitTask(id: String, name: String)

case class HeartBeat(time: Long)

case object CheckTimeOutTask

object CaseDemo04 extends App {

  val arr = Array(CheckTimeOutTask, new HeartBeat(1), SubmitTask("1", "2"))
  val a = arr(/*Random.nextInt(arr.length)*/1)
  println(a)

  a match {
    case SubmitTask(id, name) => {
      println(s"$id, $name")
    }
    case HeartBeat(time) => {
      println(s"$time")
    }
    case CheckTimeOutTask => {
      println(s"CheckTimeOutTask")
    }
    case _ => {
      println(s"default")
    }
  }


}
