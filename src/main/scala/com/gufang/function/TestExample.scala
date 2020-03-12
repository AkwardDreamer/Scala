package com.gufang.function

object TestExample {
  def main(args: Array[String]): Unit = {
    var child1 = new Child("lily")
    var child2 = new Child("tom")
    var child3 = new Child("tony")
    var child4 = Child()
    var child5 = Child("hello1")
    Child.setChild(child1)
    Child.setChild(child2)
    Child.setChild(child3)
    Child.setChild(child4)
    Child.setChild(child5)
    Child.showChild()
  }
}

class Child(cName:String){
    var name = cName
}

object Child{
  var total = 0
  def setChild(child: Child): Unit ={
    printf("child:%s join in\n",child.name)
    total += 1
  }
  def showChild(): Unit ={
    printf("total of children is %d\n",total)
  }

  def apply(): Child = new Child("cName")

  def apply(cName: String): Child = new Child(cName)
}
