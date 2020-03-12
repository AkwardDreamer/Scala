package com.gufang.function

import scala.beans.BeanProperty


object TestDog {
  def main(args: Array[String]): Unit = {
    var dog = new Dog
    dog.setName("unit")
    printf(dog.info())
    println()
    printf("result:"+160.0/50)
  }

}

class Dog{
  @BeanProperty
  var name = ""
  @BeanProperty
  var age = 0
  @BeanProperty
  var weight = 0.1

  def info(): String ={
    "age is "+this.age+",name is "+this.name+",weight"+this.weight
  }
}