package Demo01_oop

import java.text.SimpleDateFormat
import java.util.Date

//案例: 定义DateUtils工具类, 用于实现String和Date之间的相互转换
object ClassDemo14 {

  object DataUtils {
    //定义一个SimpleDateFormat类型的对象
    var sdf: SimpleDateFormat = null

    def date2String(date: Date, template: String) = {
      sdf = new SimpleDateFormat(template)
      sdf.format(date) //转换
    }

    def String2Date(dateString: String, template: String) = {
      sdf = new SimpleDateFormat(template)
      sdf.parse(dateString)

    }
  }

//  def printlnMT(a: Int): Unit = {
//    for (i <- 1 to a; j <- 1 to i) {
//      if (j == i)
//        println(s"${j}+${i}=${i * j}") else print(s"${j}+${i}=${i * j}\t")
//    }
//  }

//  val aaa = (a: String, b: String) => a + b //函数

  def main(args: Array[String]): Unit = {
    println(DataUtils.date2String(new Date(), "yyyy:MM:ss")) //2021:01:46
    println(DataUtils.String2Date("2021年01月18日", "yyyy年MM月ss日"))



  }
//    class Person() {
//      var name: String=_
//      var age: Int=_
//      def getName() = name
//
//      def getAge() = age
//
//      def setName(name: String) = {
//        this.name = name
//      }
//
//      def setAge(age: Int) = {
//        this.age = age
//      }
//
//      def sayBatty(): Unit = {
//        println(s"我改名了，我叫${this.name} ${this.age},以前叫${name}  ${age}")
//      }
//    }

}
