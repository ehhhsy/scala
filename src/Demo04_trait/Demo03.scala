package Demo04_trait
//object单例对象继承trait
object Demo03 {
  //一个特质
  trait Logger{
    def log(msg:String)
  }
//  一个特质
  trait Warning{
    def Warn(msg:String)
  }
  //object单例对象继承trait
  object ConsoleLogger extends Logger with Warning{
    override def log(msg: String): Unit = println("控制台日志信息\t"+msg)

    override def Warn(msg: String): Unit = println("控制台警告信息\t"+msg)
  }
  def main(args: Array[String]): Unit = {
    ConsoleLogger.log("打印成功")
    ConsoleLogger.log("无")
  }
}
