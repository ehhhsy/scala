package Demo03_package

import java.lang.Object
//样例对象  枚举，项目规范
object Demo07 {
  //定义特质，表示性别
  trait Sex
  case object Male extends Sex
  case object FeMale extends Sex
  case class Person(var name:String,var sex:Sex){

  }

  def main(args: Array[String]): Unit = {
//    var person1 =Person("张三","男")   //报错   
//    var person2 =Person("张三","man") //报错
      var person3=Person("张三",Male)
  }
}
