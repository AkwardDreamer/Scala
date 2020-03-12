package com.gufang.base

object TestScala1 {
  def main(args: Array[String]): Unit = {
//    println("hello scala by using idea...")
    var a = 9
    var m = 0
    var b = "hello"
    var c:Long = 19
    var d:Double = 89.89
    var f:Float = 78.09f
    var n = 5.12e+6
    var q = "12.8"
//    println(q.toFloat)
//    println(n)
//    var e:Long = 92233720368547758071L
//    a = m = 0   //
//    println(s"a=${a+12},b=$b")  //变量使用
//    println(testValue(1,2))    //函数调用
//    testCondition(a)          //条件控制语句
//    testLoop()
//    testVar()
//    testL1(1,2,3,4,5,6,7)//变长参数
//    testL1(1 to 5: _*)
    testArray()
  }
  def testValue(a:Int,b:Int) ={
    println("hello"(4))        //字符串访问元素
    println(math.sqrt(a))      //数学公式不需引包
    a.+(b)             //重载符
  }

  def testCondition(x:Int)={
    var s = if(x >0)1 else -1
    var a  = if(x>0) 1
    var b = if(x < 0)0
    else if(x < 2)2
    else 4
    println(s)
    println(a)
    println(b)
  }

  def testLoop(): Unit ={
    var n = 5
    var i = 1
    while(n > 0){
        i *= n
        n -= 1
    }
    println(i)

    for (i <- 1 to 3;j <- 2 to 4;if i != j ){
      println(i*10 + j)
    }
  }

  def testVar(): Unit ={
    var age = 10
    val name = "hello"
    age = 9
    val person = new person
//    person.age = 90
    person.name = "dog"
    println(person.name)
//    name = ""
  }

  def testInt() ={
    throw new Error("err")
  }

  def testL1(args:Int*)={
    var result = 0
    for(arg <- args)result += arg
    println("result:"+result)
  }
  def testArray()={
    var s = new Array[String](10)
    var ss = Array("hello","world")
    println("ss:"+s.length)
  }
}


class person{
  val age = 0
  var name = "hello"
}

