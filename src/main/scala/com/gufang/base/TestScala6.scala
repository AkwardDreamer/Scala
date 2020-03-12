package com.gufang.base

object TestScala6 {
  def main(args: Array[String]): Unit = {
    var age = 10
    var result =
      if (age > 10){
        println("age > 10")
      }else{
        println("age < 10")
      }
    println("result:"+result)

  }

}
