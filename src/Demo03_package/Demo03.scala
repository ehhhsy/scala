//包的可见性
package Demo03_package      //父包
package com.itheima{        //父包员工类
  class Employee{
    private[com] var name="张三"      //private在本类中使用，加上[com] 加上com包下都可以访问
    var age=23
    private[com] def sayHello()=println("hello,scala")
  }
  package scala {       //子包
    object Demo03 {
      def main(args: Array[String]): Unit = {
        var employee=new Employee
        println(employee)
        println(employee.sayHello())
      }
    }
  }
}

