package Demo04_trait

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

//类继承多个trait
object Demo02 {
  //一个特质
    trait MessageSender{
      def send(msg:String)
    }
  //一个特质
  trait MessReceiver{
    def receive()
  }
  //类继承多个trait
  class MessageWorker extends MessageSender with MessReceiver{
    override def send(msg: String): Unit = println("msg="+msg)

    override def receive(): Unit = println("收到")
  }

  def main(args: Array[String]): Unit = {
    var m=new MessageWorker
    m.send("工资总结.json")
    m.receive()
    PrintUntil.printSpliter()
    var c=new C
    c.log("哈哈哈哈哈哈哈哈哈哈哈哈")
    c.receive()
  }

  trait aaa {
    def log(msg:String)
  }
  trait bbb{
    def receive()
  }
  class C extends aaa with bbb {
    override def log(msg: String): Unit = println("msg=="+msg)

    override def receive(): Unit = println("打印成功")
  }
}
