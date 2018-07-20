package com.bigdata

import scala.collection.mutable.ArrayBuffer

/**
  * Created with IDEA by User1071324110@qq.com
  *
  * @author 10713
  */
object Singletondemo {
  def main(args: Array[String]): Unit = {
    val session = SessionFactory.getSession()
    println(session)

  }

}

object SessionFactory {
  var counts = 5
  val sessions = new ArrayBuffer[Session]()

  while (counts > 0) {
    sessions += new Session
    counts -= 1
  }
  
  def getSession():Session={
    sessions.remove(0)
  }
}

class Session {

}