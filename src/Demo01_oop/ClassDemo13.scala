package Demo01_oop

object ClassDemo13 {
  def main(args: Array[String]): Unit = {
    var p =Person("张三",22);   //不用写new
    println(p.name,p.age)

  }
  class Person(  var name:String="", var age:Int=0){

  }
  object Person{
    //apply方法，SDK会自动调用
    def apply(name: String,age: Int) = new Person(name,age);
  }
}
