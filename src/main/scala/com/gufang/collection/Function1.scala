package com.gufang.collection
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Function1 {
  def main(args: Array[String]): Unit = {
    var list1 = List(1,2,4,5,6)
    println(list1.reduceLeft(plus))
    println(list1.reduceRight(plus))
    println(list1.reduce(plus))
    println(list1.reduce(min))
    println(list1.foldLeft(-1)(min))
    println((1 to 5).scan(5)(plus))
    println((1 to 5).scanRight(5)(plus))
    println(list1.scanRight(5)(add))

    var str = "AAABBBCCCC"
    println(sumChar(str))
    println(str.foldLeft(Map[Char,Int]())(charCount))
    println(str.foldLeft(mutable.Map[Char,Int]())(charCount2))

    var lines = List("you have to go home","and you have to find a job again or study hard","so don't care about others which don't care about you")
    println(lines.flatMap(_.split(" ")).map((_,1)))
    println(lines.foldLeft("")(words).split(" ").foldLeft(Map[String,Int]())(wordCount))
  }
  def words(words:String,lines:String): String ={
    words + lines + " "
  }
  def wordCount(map:Map[String,Int],str:String): Map[String,Int] ={
      map + (str -> (map.getOrElse(str,0)+1))
  }
  def plus(a:Int,b:Int): Int ={
    a-b
  }
  def min(a:Int,b:Int): Int ={
    if(a < b) a
    else  b
  }
  def add(a:Int,b:Int): Int ={
    a + b
  }

  def sumChar(str:String): mutable.Map[Char,Int] ={
    var charMap = mutable.Map[Char,Int]()
    for (char <- str.toCharArray){
      charMap(char) = charMap.getOrElse(char,0) + 1
    }
    charMap
  }

  def charCount(map:Map[Char,Int],char:Char):Map[Char,Int]={
    map + (char -> (map.getOrElse(char,0)+1))
  }

  def charCount2(map:mutable.Map[Char,Int],char:Char):mutable.Map[Char,Int]={
    map += (char -> (map.getOrElse(char,0)+1))
  }
}
