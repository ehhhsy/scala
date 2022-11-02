package Demo05_function

import scala.collection.mutable.ListBuffer

// 可变列表
object Demo09 {
  def main(args: Array[String]): Unit = {
    val list1=ListBuffer[Int]()
    println(list1)    //ListBuffer()

    val list2=ListBuffer(1,2,3,4)
    println(list2)  //ListBuffer(1, 2, 3, 4)

  }
}
