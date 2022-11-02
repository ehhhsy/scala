package Demo02_extends

//getClass/classOf
//精准判断出对象的类型就是指定的数据类型
object Demo05 {
    class Person
  class Student extends Person

  def main(args: Array[String]): Unit = {
    var p:Person =new Student
    var b=p.isInstanceOf[Student]   //是否Student类型，true
    var c=p.isInstanceOf[Person]    //是否Person类型，true

    //getClass /classOf
    println(p.getClass==classOf[Student]) //是否Student类型，true
    println(p.getClass==classOf[Person])  //是否Person类型 false,因为你new的是Students
  }
}
