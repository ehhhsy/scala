package Demo06_regex
//匹配元组
object Demo07 {
  def main(args: Array[String]): Unit = {
    val tuple1=(1,2,55)
    val tuple2=(22,222,5)

    tuple1 match {
      case (1,x,y)=>println("开头为1,长度为3的元组")
      case (x,y,5)=>println("结尾为5,长度为3的元组")
    }
  }
}
