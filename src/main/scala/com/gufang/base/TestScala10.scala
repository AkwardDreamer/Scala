package com.gufang.base

object TestScala10 {
  def main(args: Array[String]): Unit = {
    var cat = new Cat
    cat.age = 18
    cat.name = "holly"
    cat.color = "red"
    printf("%d,%s,%s",cat.age,cat.color,cat.name)

  }

}

class Cat{
  var name = ""
  var age:Int=0
  var color:String=_
}
