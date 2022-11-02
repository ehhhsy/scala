package Demo05_function

import scala.collection.mutable.ArrayBuffer

//变长数组
object Demo02 {
  def main(args: Array[String]): Unit = {
//    定义一个长度为0的整型变长数组
    val array=ArrayBuffer[String]()

//   定义一个包含"hadoop", "storm", "spark"这三个元素的变长数组.
    var array2=ArrayBuffer("hadoop","storm","spark")
    println(array2)


    println("-"*15)
   val array3=ArrayBuffer[Int]()


   val array4=ArrayBuffer("hadoop","storm","spark")

    val array5=new ArrayBuffer[Int]()
    val array6=ArrayBuffer(1,2,3)
    for (i<- array6)println(i)


  }
}
