package com.gufang.collection

object Function4 {
  def main(args: Array[String]): Unit = {
    //参数推断
    val list1 = List(2,3,4,6)
    println(list1.map((x:Int)=>x+1))
    println(list1.map((x)=>x+1))
    println(list1.map(x=>x+1))
    println(list1.map(_+1))

//    println(list1.reduce(sum))
    println(list1.reduce((x:Int,y:Int)=>x+y))
    println(list1.reduce((x,y)=>x+y))
    println(list1.reduce(_+_))

    println(sum(1)(2))
    println(reverse("hello"))
    println(factorial(8))
    println(fi(7))

  }

//  def sum(a:Int,b:Int): Int ={
//    a+b
//  }
  def sum = (a:Int) =>(b:Int)=>a+b
  def reverse(str:String):String={
    if (str.length == 0){
      str
    }else{
      reverse(str.tail) + str.head
    }
  }

  def factorial(n:Int): Int ={
    if (n==0)1 else factorial(n-1)*n
  }

  def fi(n:Int):Int ={
    if (n==1 || n== 2) 1 else fi(n-1)+fi(n-2)
  }

}
