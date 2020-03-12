package com.gufang.collection

import scala.collection.mutable.ListBuffer

object Collection2 {
  def main(args: Array[String]): Unit = {
    var tuple1 = (1,2,3,4,9,"hello")
    for (i <- tuple1.productIterator){
      println("tuple:"+i)
    }

    var list = List(1,2,3,5)
    var list1 = list :+ 8
    var list2 = 4 +: list1
    println(list(1))
    println(list1(4))
    println(list2(0))

    var list3 = 5 :: 6 :: list
    var list4 = 8 :: 9 :: list :::Nil

    var butter = ListBuffer[Int](2,4,3,1,5)
    var butter1 = new ListBuffer[Int]
    butter += 4
    butter.append(9)
    for (i <- butter){
      println("element:"+i)
    }
    butter1 ++= butter
    var butter3 = butter1 ++ butter
    var butter4 = butter :+ 9
    println("butter1:"+butter1)
    println("butter3:"+butter3)
    println("butter4:"+butter4)
  }
}
