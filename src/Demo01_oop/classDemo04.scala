package Demo01_oop

//案例：定义成员变量
object classDemo04 {
  def main(args: Array[String]): Unit = {
      val p =new Person
      p.age=20
      p.name="张三"
      print(p.name,p.age)   //(张三,20)
  }
  class Person{
//    方式1 普通写法
//     var name:String="";
//     var age:Int=0;

//    方式2  采用类型推断
//    var name="";
//    var age=0;

//    方式3 _初始化
      var name:String=_;
      var age:Int=_;
  }
}

