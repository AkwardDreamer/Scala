package com.gufang.base

object TestScala8 {
  def main(args: Array[String]): Unit = {
    var n1 = 1
    var n2 = 2
//    println("result:"+getRes(n1,n2,')'))
    lazy val result = sum(1,2,3,4,5,6,6)
    println("fb:"+fb(1))
    println("result:"+result)
    getStart(7)
    getPlus()
  }
  def getRes(n1:Int,n2:Int,op:Char)={
    if (op == '-'){
      n1 - n2
    }else if(op == '+'){
      n1 + n2
    }else{
      null
    }
  }

  def fb(n:Int=3):Int ={
    if (n == 1 || n == 2){
      1
    }else{
      2*fb(n-1)+1
    }
  }

  def sum(n:Int,args:Int*):Int={
    println("hello,I'm in")
    var sum = n
    for(arg <- args){
      sum += arg
    }
    sum
  }
  def getStart(layer:Int): Unit ={
    for(i <- 1 to layer){
      println(" "*(layer-i)+"*"*(i*2-1))
    }
  }
  def getPlus(): Unit ={
    for(i <- 1 to 9){
      for(j<- 1 to 9) {
        if (i >= j)
          printf("%d*%d=%d\t",j,i,i*j)
      }
      println()
    }
  }

}
