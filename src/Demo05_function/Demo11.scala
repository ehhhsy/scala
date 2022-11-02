package Demo05_function

import scala.collection.mutable.ListBuffer

//可变列表操作
object Demo11 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4)
    val b: Boolean = list1.isEmpty
    println(b) //false

    val list2 = List(4, 5, 6)
    val list3 = list1 ++ list2
    println(list3) //List(1, 2, 3, 4, 4, 5, 6)

    println(list3.head) //1             返回值：List(第一个元素)

    println(list3.tail) //List(2, 3, 4, 4, 5, 6)    返回值：List(除了第一个之外的全部)

    val list4 = list3.reverse
    println(list4) //List(6, 5, 4, 4, 3, 2, 1)

    println(list3.take(3)) //List(1, 2, 3)       take  返回值：List(前三个元素)

    println(list3.drop(3)) //List(4, 4, 5, 6)    drop 返回值：List(除了前3个元素的的全部)

    println("-" * 20)

  }
}