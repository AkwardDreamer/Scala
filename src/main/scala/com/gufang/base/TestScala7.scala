package com.gufang.base

object TestScala7 {
  def main(args: Array[String]): Unit = {
    var list = List("hello",1,2,"c",0.89f)
    for (l <- list){
      println("element:"+l)
    }
    println("================")
    for (i <-1 to 9){
      println("i:"+i)
    }
    println("=================")
    for(i <- 1 until 9){
      println("i:"+i)
    }
    println("================")
    for (i <- 1 to 9;j <- 1 to 2){
      println("i:"+i+" j:"+j)
    }
    println("===============")
    var result = for(i <- 1 until 9) yield {
      if (i != 5){
        i
      }else{
        println("i == 5")
      }
    }
    println("result:"+result)
    println("=================")
    var result1 = for{
      i <- 1 to 9
      j <- 2 to 4
    }yield i+j
    println("result1:"+result1)
    println("================")
    for(i <- Range(1,10,2)){
      println("i:"+i)
    }
  }
}
