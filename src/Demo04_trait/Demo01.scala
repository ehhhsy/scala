package Demo04_trait

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

//类继承单个特质
object Demo01 {


  trait Logger{
    def log(msg:String)
  }
  class ConsoleLogger extends Logger{
    override def log(msg: String)=println(msg)
  }
  def main(args: Array[String]): Unit = {
    var c=new ConsoleLogger
    c.log("类继承单个特质")
    PrintUntil.printSpliter()
//    var cat=new Cat
//    cat.jiao()
  }

//  trait animal{
//    def jiao()
//  }
//  class Cat extends animal{
//    override def jiao(): Unit = println("妙妙猫")
//  }
//}
}