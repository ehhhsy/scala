package Demo06_regex

import scala.io.StdIn
//PartialFunction偏函数
object Demo11 {
  def main(args: Array[String]): Unit = {
    val pf:PartialFunction[Int,String]={
      case 1 =>"一"
      case 2 =>"二"
      case 3 =>"三"
      case _=>"其他"
    }
  println(pf(1))
  println(pf(2))
  println(pf(3))
  println(pf(4))
  }
}
