package Demo04_trait
//trait继承class
object Demo10 {
  class Message{
    var name="";
    def printMsg()=println("学好scala,走到哪里都不怕")
  }
  trait Logger extends Message{

  }
  class ConsloeLogger extends  Logger{
    name="Con"
  }

  def main(args: Array[String]): Unit = {
    var consloeLogger =new ConsloeLogger
    println(consloeLogger.name)
    consloeLogger.printMsg()
  }
}
