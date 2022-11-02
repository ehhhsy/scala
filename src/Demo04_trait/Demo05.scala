package Demo04_trait

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

//对象混入trait     动态混入
object Demo05 {
  //一个特质
  trait Logger{
    def log(msg:String)
  }
  //一个类 该类和Logger特质没有任何关系
  class User

  def main(args: Array[String]): Unit = {
    //动态混入 with Logger
    var user=new User with Logger {
      override def log(msg: String): Unit = println("msg="+msg)
    }
    user.log("对象混入trait")
    PrintUntil.printSpliter()
    var tao=new taob with t
    tao.sout
  }

  trait t{
    def sout=println("sout=System.out.println")
  }
  class taob

}
