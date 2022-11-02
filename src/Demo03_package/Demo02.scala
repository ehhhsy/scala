//包对象

package Demo03_package

package com.itheima{    //父包

  package scala{      //字包
    class A
    trait B
//    var name=""     //不能在包里定义对象，可以定义类和特质

    //测试类
    object Demo02 {
      def main(args: Array[String]): Unit = {
        println(scala.name)
        scala.printHello
      }
    }
  }

  package object scala{
    var name="掌声"
    def printHello=println("hello")
  }

}

