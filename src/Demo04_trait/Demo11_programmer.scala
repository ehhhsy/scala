package Demo04_trait

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

object Demo11_programmer {
  //抽象类
  abstract class Programmer{
      val name=""
      val age=0

      def eat()=println("干饭咯")
      def skill()
    }
   class Java_Programmer extends Programmer {
    override def eat(): Unit =println("java程序员吃鸡蛋")
    override def skill(): Unit =println("我会java技术")
  }
  class PartJava_Programmer extends Java_Programmer with BigData {
    override def eat(): Unit = println("吃鸡腿")

    override def skill(): Unit = {
      super.skill()
      super.learningBigdata()
    }

  }
  //一个特质
  trait BigData{
    def learningBigdata(): Unit ={
      println("学会了hadoop,hive,zookeeper,flume,scala,Hbase")
    }
  }

  class Python_Programmer extends Programmer{
    override def skill(): Unit = println("我会爬虫")

    override def eat(): Unit = println("Python程序员吃鸭蛋")
  }
  class PartPython_Programmer extends Python_Programmer with BigData{

    override def skill(): Unit = {
      super.skill()
      super.learningBigdata()
    }

    override def eat(): Unit = println("吃鸭腿")
  }

  def main(args: Array[String]): Unit = {
    val partJava_Programmer =new PartJava_Programmer
    partJava_Programmer.eat()
    partJava_Programmer.skill()
    PrintUntil.printSpliter()
    val java_Programmer=new Java_Programmer
    java_Programmer.skill()
    java_Programmer.eat()

  }
}
