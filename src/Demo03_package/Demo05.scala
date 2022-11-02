package Demo03_package
//样例类
object Demo05 {
  case class Person(name:String,var age:Int)
  def main(args: Array[String]): Unit = {
    var person =new Person("漳卅",23)
//    person.name="李四"    报错，无法修改，默认是val
    person.age=211
    println(person.age)   //211
  }
}
