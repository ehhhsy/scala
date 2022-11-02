package Demo05_function
//迭代器
object Demo21 {
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3,4,5)
    var it=list.iterator
    //while遍历
    while (it.hasNext) println(it.next())
  }
}
