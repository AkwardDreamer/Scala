package com.gufang.function

object TestExtend {
  def main(args: Array[String]): Unit = {
    val student = new Student("hellos")
//    val person = new Persons()
//    var test = new TestHello(1)
//    student.name = "jack"
//    student.age = 9
//    student.studying()
//    student.showInfo()
//    student.getSalary()
  }

}

class Persons(names:String,ages:Int){
  var name:String= names
  var age:Int=_
  def this(pname:String){
    this(pname,1)
    println("person construct:"+pname)
  }
  def showInfo(): Unit ={
    println("学生信息如下：")
    println("名字： "+this.name)
  }
  private def showSalary(): Unit ={
    println("salary:"+(this.age*2-1))
  }
  def getSalary(): Unit ={
    showSalary()
  }
}

class Student(pname:String,age:Int) extends Persons(pname){
  def this(name:String){
    this(name,1)
    this.name = name
    println("student construct:"+this.name)
  }
  override def showInfo(): Unit = {
//    super.showInfo()
    super.showInfo()
    println("学生名字如下：")
    println("名字 "+this.name)
  }

  def studying(): Unit ={
    println(this.name+"学习scala中.....")
  }
}

//class TestHello(ids:Int){
//  var id:Int = ids
//  def this(id:Int,str:String){
//    this(1)
//    println("hello:"+this.id)
//  }
//}