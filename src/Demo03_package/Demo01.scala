package Demo03_package
package com.itheima{
  class Person
  class Teacher
  package scala{

    import Demo03_package.com.itheima
    import Demo03_package.com.itheima.Person

    class Person
    class Student

    //作用域
    object Demo01 {
      def main(args: Array[String]): Unit = {
        var teacher =new Teacher    //下层包可以访问下层包
        println(teacher)   //   Demo03_package.com.itheima.Teacher@1f37ef1

      }
    }

  }
}
