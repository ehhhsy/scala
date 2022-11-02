package Demo06_regex
//匹配类型
object Demo02 {
  def main(args: Array[String]): Unit = {
    val a:Any=0.1
    a match {
      case a:Double=>println("这是Double类型")
      case a:Int=>println("这是Int")
      case a:String=>println("这是String")
      case _=>println("未匹配")
    }
  }
}
