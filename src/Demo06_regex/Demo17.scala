package Demo06_regex

import Demo06_regex.Demo17.Student.unapply

object Demo17 {
  def main(args: Array[String]): Unit = {
    //方式1
    val s1 = Student("aa", 77)
    println(s1.name, s1.age)
    println("-" * 15)

    //方式2，直接调用unappy方法
    val result = unapply(s1)      //Some((aa,77))
    println(result)
    println("-" * 15)

    //方式3
    s1 match {
      case Student(name,age)=>println(name,age)
      case _=>println("未匹配")
    }

  }

  class Student(var name: String, var age: Int) //注意这里用var修饰


  object Student {
    //apply() 根据给定的字段，将其封装成一个Student类型的对象
    def apply(name: String, age: Int) = new Student(name, age)

    //unapply() 根据Student类型的对象，获取其对应的各个属性
    def unapply(s: Student) = {
      if (s == null) {
        None
      } else {
        Some(s.name, s.age)
      }
    }
  }

}


