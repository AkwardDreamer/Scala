package com.gufang.collection

object Function3 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,"hello",89.12,'a')
    val partialFun = new PartialFunction[Any,Int] {
      override def isDefinedAt(x: Any) = {
        println("x="+x)
        x.isInstanceOf[Int]
      }

      override def apply(v1: Any)={
        println("v1:"+v1)
        v1.asInstanceOf[Int] + 1
      }
    }
    val list2 = list.collect(partialFun)
    println("list2:"+list2)
    println("list3:"+list.collect(partialFun2))

    val list4 = list.collect{
      case i:Int => i + 1
      case j:Double => (j*3).toInt
      case m:Char => m.toInt
    }
    println(list4)


    var tripe = (x:Double)=>{
      println("x:"+x)
      x*3
    }
    println(tripe(3))

    var add = (a:Int,b:Int)=>{
      a+b
    }
    println("add:"+add(1,2))

    println("test:"+test(sum,mod,9))
    var su = testSum(2)
    println("testSum:"+su)
    println("testSum1:"+su(3))
    println("testSum2:"+testSum(3)(6))
  }
  def partialFun2:PartialFunction[Any,Int] ={
    case i:Int => i + 1
    case j:Double => (j*2).toInt
  }

  def test(f1:Double =>Double,f2:Int => Double,t: Int)={
    f1(f2(t))
  }

  def mod(a:Int): Double ={
    4.0 / a
  }

  def sum(a:Double): Double ={
    a + 1
  }

  def testSum(a:Int) ={
    (y:Int)=>{
      a+y
    }
  }
}
