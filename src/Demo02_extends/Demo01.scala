package Demo02_extends

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

//类继承
object Demo01 {
  class Person{
    var name="";
    var age=0;

    def eat() =println(s"${name}在吃饭")
  }
  class teachers extends Person {

  }
  class students extends Person {

  }

  def main(args: Array[String]): Unit = {
    var students =new students
    students.name="王小波"
    students.age=22
    students.eat()
    PrintUntil.printSpliter()
    var t=new teachers
    t.name="里老师"
    t.age=11
    t.eat()
  }
}
