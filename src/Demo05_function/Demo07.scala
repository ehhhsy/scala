package Demo05_function
//访问元组中的元素
object Demo07 {
  def main(args: Array[String]): Unit = {
    val tuple1 = ("zhangsan", "male")

    //    1.访问元组中的单个元组 不是下标
    println(tuple1._1)
    println(tuple1._2)

    //    2.迭代器
    var a = tuple1.productIterator
    for (i <- a) println(i)

    println("-" * 15)
    val tuple2 = ("张三", 22, 31, 1, 23.22, 0.5, "aza")
    println(tuple2._2)
    var b=tuple2.productIterator
    for (i<- b) println(i)
  }
}
