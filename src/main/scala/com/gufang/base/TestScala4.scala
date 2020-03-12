package com.gufang.base

import scala.io.StdIn

object TestScala4 {
  def main(args: Array[String]): Unit = {
    println("please input your name:")
    var name = StdIn.readLine()
    println("please input your age:")
    var age = StdIn.readInt()
    println("please input your salary:")
    var sal = StdIn.readFloat()
    printf("用户的信息是name=%s age=%d sal=%.2f",name,age,sal)
  }

}
