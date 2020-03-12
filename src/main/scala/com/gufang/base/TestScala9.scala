package com.gufang.base

object TestScala9 {
  def main(args: Array[String]): Unit = {
    try{
      var i = 10
      var j = 0
      var b = i / j
    }catch {
      case ex:ArithmeticException=>{
        println("捕获除数为0的错误")
      }
      case ex:Exception=>{
        println("抛出异常了")
      }
    }finally {
      println("ok")
    }
    println("ok~~~~~")
  }
}
