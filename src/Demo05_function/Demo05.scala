package Demo05_function

import scala.collection.mutable.ArrayBuffer

//数组的常用方法
object Demo05 {
  def main(args: Array[String]): Unit = {
    val array=ArrayBuffer(4,1,6,5,2,3)
    //  1.sum求和
    var sum=array.sum
    println(sum)      //21

//      2.max求最大值
    var max=array.max
    println(max)      //6

//      3.min求最小值
    var min=array.min
    println(min)      //1

//      4.sorted排序(升序)，返回新数组
    var array2=array.sorted
    println(array2)   //ArrayBuffer(1, 2, 3, 4, 5, 6)

//      5.reverse反转，返回新数组
    var array3=array.reverse
    println(array3)   //ArrayBuffer(3, 2, 5, 6, 1, 4)


//        小技巧 降序=sorted升序+反转
    println("-"*12)
    val array_1=ArrayBuffer(4,5,77,9)

    println(array_1.sum)

    println(array_1.max)

    println(array_1.min)

    println(array_1.sorted)

    println(array_1.reverse)

  }

}
