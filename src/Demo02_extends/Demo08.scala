package Demo02_extends

//匿名内部类
//使用场景
object Demo08 {
  abstract class Person{
    def sayHello()
  }
  def show(person: Person): Unit ={
    person.sayHello()
  }

  def main(args: Array[String]): Unit = {
    show(new Person {                               //匿名对象作为方法的参数
      override def sayHello(): Unit = println("hello——2021")
    })
  }
}
