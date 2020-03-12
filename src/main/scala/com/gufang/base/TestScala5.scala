package com.gufang.base

import scala.io.StdIn

object TestScala5 {
  def main(args: Array[String]): Unit = {
    println("please input your age:")
    var age = StdIn.readInt()
    if (age > 10) {
      println("age > 10")
    } else if (age > 5) {
      println("5 < age < 10")
    } else {
      println("age < 5")
    }
  }

}
