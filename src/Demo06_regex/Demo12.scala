package Demo06_regex
//偏函数结合map函数
object Demo12 {
  def main(args: Array[String]): Unit = {
    val list1=(1 to 10).toList
    val list2=list1.map{
      case x if x>=1 && x<=3 =>"[1-3]"
      case x if x>3  && x<=8 =>"[4-8]"
      case _ =>"[8-*]"
    }
    println(list2)
    //List([1-3], [1-3], [1-3], [4-8], [4-8], [4-8], [4-8], [4-8], [8-*], [8-*])
  }
}
