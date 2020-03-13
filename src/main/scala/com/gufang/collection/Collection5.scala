package com.gufang.collection

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Collection5 {
  def main(args: Array[String]): Unit = {
    var set1 = Set(1,2,3,5,6,1,2,3)
    var set2 = mutable.Set(2,3,4,5,4)
    println("set1:"+set1)
    println("set2:"+set2)
    set2.add(3)
    set2 += 9
    set2 -= 2
    set2.remove(3)
    println("set2:"+set2)
    for(s <- set2){
      println("s:"+s)
    }

    var list = ListBuffer[Int](3,5,7)
    println(deal(list))
    var list1 = List(2,3,4)
//    println(deal1(list1))
    println(dealList(deal,List(2,3,4)))
    println(list1.map(dealInt))
    var list2 = List("tim","you")
    println(list2.flatMap(upper))

    var list3 = List("hello world","hello scala")
    println(list3.flatMap((x:String)=>x.split(" ")))
    println(list3.flatMap(_.split(" ")))

  }
  def deal(list:ListBuffer[Int]): ListBuffer[Int] ={
    var newList = new ListBuffer[Int]
    for (l <- list){
      newList.append(l*2)
    }
    newList
  }
  def deal(list:List[Int]): List[Int] ={
    var newList = List[Int]()
    for (l <- list){
      newList = newList :+ l*2
    }
    newList
  }

  def dealInt(i:Int): Int ={
    i * 2
  }
  def upper(s:String): String ={
    s.toUpperCase
  }
  def dealList(f:List[Int]=>List[Int],list:List[Int])={
    f(list)
  }

}

