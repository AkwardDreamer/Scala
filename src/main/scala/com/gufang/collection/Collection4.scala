package com.gufang.collection

import java.util

import scala.collection.mutable

object Collection4 {
  def main(args: Array[String]): Unit = {
    var m1 = Map("hello"->1,"world"->2)
    var m2 = mutable.Map("you"->2)
    var m3 = mutable.Map(("i",4),("j",9))
    println("m1:"+m1)
    println("m2:"+m2)
    println("m3:"+m3)
    println("key1:"+m3("j"))
//    println("key:"+m3("l"))
    println("contain:"+m3.contains("l"))
    println("get:"+m3.get("i").get)
    m3("i") = 7
    println(m3("i"))
    m3 += ("i"->1)
    println(m3("i"))
    var m4 = m3 ++ m2
    var m5 = m3 + ("he"->7,"you"->0)
    println("m4:"+m4)
    println("m5:"+m5)
    m5 -= ("i","j")
    println("m5:"+m5)
    for ((k,v)<-m5){
      println(k+":"+v)
    }
    for (k <- m5.keys){
      println("k:"+k)
    }
    for (k <- m5.values){
      println("v:"+k)
    }
    removeMore(2,3,4,2,3,4,1)
  }


  def removeMore(number:Int*): Unit ={
    var map1 =  mutable.Map(0->1)
    for(i <- number){
      if (map1.contains(i)){
        map1(i) += 1
      }else{
        map1(i) = 1
      }
    }
    map1 -= (0)
    for((k,v)<-map1){
      println(k+":"+v)
    }
  }
}
