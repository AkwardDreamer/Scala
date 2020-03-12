package com.gufang.function

object TestCompany {
  def main(args: Array[String]): Unit = {
    println(ScalaPerson.sex)
    ScalaPerson.sayHi()
    val scala = new ScalaPerson()
  }
}


object ScalaPerson{
  var sex:Boolean = true
  def sayHi(): Unit ={
    println("hello,scala...")
  }
}

class ScalaPerson{
  var name:String=_
  println("hello,class scala....")
}