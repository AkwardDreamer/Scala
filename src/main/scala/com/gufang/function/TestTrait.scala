package com.gufang.function

object TestTrait {
  def main(args: Array[String]): Unit = {

    var c = new C
    c.getConnect()
    var e = new E
    e.getConnect()


  }

}

trait Connect{
  def getConnect()
}

class A{

}

class B extends A{

}

class C extends A with Connect {
  override def getConnect(): Unit = {
    println("connect mysql....")
  }
}

class D {

}
class F extends D{

}
class E extends D with Connect{
  override def getConnect(): Unit = {
    println("connect mongo...")
  }
}
