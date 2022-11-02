package Demo08_highorderFuntion
//匿名函数
object Demo02 {
  def main(args: Array[String]): Unit = {
    val list1=(1 to 10 ).toList

    val list2 = list1.map((x: Int) => "*"*x)  //匿名了

//    优化
    val list3=list1.map("*" * _)
    println(list2)
  }
}
