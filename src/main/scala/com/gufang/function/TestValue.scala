package com.gufang.function

object TestValue {
  def main(args: Array[String]): Unit = {
    implicit def f1(d1:Double): Int ={
      d1.toInt
    }
    implicit def dbs(mySQL: MySQL): DB ={
      new DB
    }
    implicit val names:String = "jack~~~"
    hello
//    var mySQL = new MySQL
//    mySQL.insert()
//    mySQL.delete()
//    mySQL.update()

//    var i:Int = 90.5
//    var j:Double = 89
//    println("i:"+i)

  }
  def hello(implicit str:String): Unit ={
    println("hello,I'm "+str)
  }

}

class MySQL{
  def insert(): Unit ={
    println("insert")
  }
}

class DB{
  def delete(): Unit ={
    println("delete")
  }
  def update(): Unit ={
    println("update")
  }
}
