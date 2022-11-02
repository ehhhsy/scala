package Demo05_function

import scala.collection.mutable.ArrayBuffer

// 遍历数组
object Demo04 {
  def main(args: Array[String]): Unit = {
    val array1 =Array(1,2,3,4,5)
    val array2=ArrayBuffer(1,2,3,4,5)

//    1.使用 `索引` 遍历数组中的元素
    for (i<-0 to array1.length-1) print(array1(i)+"\t")
    println("")
    for (i<-0 until(array2.length))print(array2(i)+"\t")    //until 关键字

      println("-"*15)
//    2.使用 `for表达式` 直接遍历数组中的元素'
    for(i<- array1)print(i)+"\t"
    println("")
    for(i<- array2)print(i)+"\t"
  }
}
