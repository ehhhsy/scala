package Demo02_extends

// 类继承
object Demo02 {
    class Person{
      var name="";
      def print()=println("hello")
    }
  object Test extends Person {
  }
  def main(args: Array[String]): Unit = {
    Test.name="Betty"
    println(Test.name)
    Test.print()
  }
}
