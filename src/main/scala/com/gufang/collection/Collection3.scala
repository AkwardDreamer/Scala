package com.gufang.collection

import scala.collection.mutable

object Collection3 {
  //Queue
  def main(args: Array[String]): Unit = {
    var queue = new mutable.Queue[Int]
    queue.append(8)
    queue += 9
    queue ++= List(1,2,3)
    println("queue:"+queue)
    queue.dequeue()
    println("queue1:"+queue)
    queue.enqueue(5)
    println("queue2:"+queue)
    println("queue.tail:"+queue.tail.tail)
    println("queue.head:"+queue.head)
    println("queue.last:"+queue.last)
  }
}
