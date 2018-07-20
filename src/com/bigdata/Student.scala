package com.bigdata

import com.bigdata.Student.{getAge, getName}

/**
  * Created with IDEA by User1071324110@qq.com
  *
  * @author 10713
  */
class Student(val name: String, var age: Int = 19, faceValue: Double = 99.99, private var height: Int = 18) {

  private[this] var gender: String = null

  println("初始构造器" + name)

  def show(): Unit = {
    println(gender)
  }

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }


}

object Student {

  var name: String = ""
  var age: Int = 0

  def apply(name: String, age: Int): Unit = {
    this.name = name
    this.age = age
  }

  def getName():String={
    name
  }
  def getAge():Int={
    age
  }



  def main(args: Array[String]): Unit = {
    /*    val s1 = new Student("z", 18)
        val s2 = new Student("x", 18, "男")
            println(s1.age)
            s1.height = 12
            println(s1)
            val s3 = new Student("x")
        s1.show()
        s2.show()*/
    Student("1", 2)
    println(Student.getName())
    println(Student.getAge())
    Student("1", 333)
    println(Student.getName())
    println(Student.getAge())



  }
}

object T {
  def main(args: Array[String]): Unit = {
//    val student = new Student("x", 13)
    //    student.height = 12

  }
}
