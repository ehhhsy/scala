package Demo01_oop

object ClassDemo06 {
  def main(args: Array[String]): Unit = {
      var p =new Person
      p.setName("李四")
      p.setAge(22)
      print(p.getName(),p.getAge())



  }
  class Person{
    private var name="";
    private var age=0;

    def getName()=name
    def setName(name:String) = this.name=name
    def getAge()=age
    def setAge(age:Int)=this.age=age
    private def sayHello()=println("hello")
  }
}
