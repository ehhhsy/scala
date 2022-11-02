package Demo01_oop

//private[this]修饰
object ClassDemo12 {
  def main(args: Array[String]): Unit = {
    var r=new Person
  }
  class Person{
    private[this] var name="";
  }
  object Person{
    def printPerson(): Unit ={
//      println(s"${Person.name}")   报错,伴生对象无法访问Person.name（被private[this]修饰）
    }
  }
}
