package Demo05_function
//列表转字符串
object Demo14 {
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3,4)
    println(list.toString())  //本来就是默认调用toString

    println("-"*15)
    println(list.mkString("|")) //1|2|3|4
  }
}
