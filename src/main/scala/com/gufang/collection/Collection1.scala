package com.gufang.collection

import scala.collection.mutable.ArrayBuffer

object Collection1 {
  def main(args: Array[String]): Unit = {
    //定长数组
    var array1 = Array(1,2,3)
    for (arr <- array1){
      println(arr)
    }
    println("after")
    var newArr = array1.toBuffer
    newArr.append(89)
    for (arr <- newArr){
      println(arr)
    }

    println("==================")
    //可变数组
    var array2 = ArrayBuffer[Int]()
    array2.append(2)
    array2.append(3)
    for (arr <- array2){
      println(arr)
    }
    println("after1")
    var newArr2 = array2.toArray
    newArr2(1) = 1
    for (arr <- newArr2){
      println(arr)
    }
  }
}
