package Demo01_oop

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

//主构造器
object ClassDemo07 {
  def main(args: Array[String]): Unit = {
      var p1=new Person
      println(s"p1:${p1.name},${p1.age}")     //空参数

      var p2=new Person("李四",29)
      println(s"p2:${p2.name},${p2.age}")       //全参数

      var p3=new Person(age=222)
      println(s"${p3.name},${p3.age}")          //单独改age

    PrintUntil.printSpliter()
    var s=new Student("百事区",60.8);
    println(s.address,s.score)
  }
  class Person(var name:String="张三",var age:Int=20){
    println("调用了主构造器")
  }

  class Student(var address:String,var score:Double){
  }
}
