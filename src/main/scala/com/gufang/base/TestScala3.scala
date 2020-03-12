package com.gufang.base

object TestScala3 {
  def main(args: Array[String]): Unit = {
    var t1 = 10 % 3
    var t2 = -10 % 3
    var t3 = -10 % -3
    var t4 = 10 % -3
    printf("t1:%d \n",t2)
    var s = 2
    s <<= 3
    s >>= 2
    printf("s:%d",s)
  }

}
