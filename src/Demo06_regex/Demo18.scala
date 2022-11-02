package Demo06_regex

import scala.io.StdIn

//随机职业
object Demo18 {
  def main(args: Array[String]): Unit = {
    println("请输入数字1-5，我来告诉你上辈子的职业")
    val number=StdIn.readInt()
    val a=number match {
      case 1  => "一品带刀守卫"
      case 2  => "宰相"
      case 3  => "江湖浪子"
      case 4  => "打铁匠"
      case 5  => "店小二"
      case _=> "未匹配"
    }
    println(a)
  }
}
