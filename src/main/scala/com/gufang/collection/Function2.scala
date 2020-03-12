package com.gufang.collection

object Function2 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice","Bob","Nick")
    val names2 = names.filter(startA)
    println("names:"+names)
    println("names2:"+names2)

    var oper = '_'
    oper match {
      case '+' =>{
        println("haha")
      }
      case '_' => println("xxixi")
      case '*' => println("you")
      case 1 => println("1")
      case _ => println("error")
    }

    testSwitch()

  }
  def startA(str:String):Boolean={
    str.startsWith("A")
  }

  def testSwitch(): Unit ={
    for (ch <- "+-3"){
      var digit = 0
      ch match {
        case '+' =>digit =1
        case '-' => digit =2
        case _ if ch.toString.equals("3") =>digit =3
        case _=>digit = 5
      }
      println(digit)

    }
  }

}
