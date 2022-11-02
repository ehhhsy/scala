package Demo01_oop

object ClassDemo08 {
  def main(args: Array[String])= {
    var c= new Customer(Array("王五","东莞"))
//    print(c.name,c.address)
  }
  class Customer(name:String,address:String){
    //辅助构造器
    def this(array: Array[String]){
      //第一行必须访问主构造器或者其他的辅助构造器
      this(array(0),array(1))
    }
  }
}
