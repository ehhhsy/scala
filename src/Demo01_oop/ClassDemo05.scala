package Demo01_oop

object ClassDemo05 {
  def main(args: Array[String]): Unit = {
    var c=new Customer
    c.name="张三"
    c.sex="99"
    println(c.name,c.sex)
    c.printHello("你好，再见 "+c.name);
  }
  class Customer{
    var name="";
    var sex="";

    def printHello(msg:String)= println(msg)
  }
}
