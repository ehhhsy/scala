package Demo04_trait

object Demo09 {
  trait Logger{
    println("执行Logger构造器")
  }
  trait MyLogger extends Logger {
    println("执行MyLogger构造器")
  }
  trait TimeLogger extends Logger{
    println("执行TimeLogger构造器")
  }
  class Person {
    println("执行Person构造器")
  }
  class Student extends Person with MyLogger{
    println("执行Student构造器")
  }

  def main(args: Array[String]): Unit = {
    var student =new Student
  }
}
