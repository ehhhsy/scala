package Demo01_oop

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

object ClassDemo03 {
  def main(args: Array[String]): Unit = {
    val a= new Person //  如果构造器的参数为空，可以省略（）
    println(a)
    PrintUntil.printSpliter()
    var s=new Student
    s.setAge(23)
    s.setName("黄慧婷")
    println(s.getName(),s.getAge())
    s.printHello("猪猪猪")
  }
  class Person    //  如果类是空的，没有任何成员，可以省略{ }

  class Student{
    private var name="张三"
    private var age=23
    def getName()=name
    def setName(name:String)=this.name=name
    def getAge()=age
    def setAge(age:Int)=this.age=age

    def printHello(msg:String): Unit ={
      println(msg)
    }
  }
}
