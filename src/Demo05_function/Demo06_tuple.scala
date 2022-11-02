package Demo05_function
// 元组
object Demo06_tuple {
  def main(args: Array[String]): Unit = {
//    val/var 元组 = (元素1, 元素2, 元素3....)
    val tuple1=("张三",23)
//    格式二: 通过箭头来实现,只适用于元组中只有两个元素的情况
    var tuple2="张三"->23

    val tuple3=("tt",55)
    println(tuple3)   //(tt,55)
    val tuple4=22->21
    println(tuple4) //(22,21)

    println("-"*15)
    val tuple_1=("张三","乐山区")
    println(tuple_1)
    println(tuple_1._1)
    println(tuple_1._2)

    val tuple_2=23->11
    println(tuple_2)
    println("-"*15)

    val a=tuple_1.productIterator
    for (o<- a)println(o)
  }
}
