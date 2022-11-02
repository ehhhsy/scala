package Demo06_regex
//类型匹配
import scala.io.StdIn

object Demo03 {
  def main(args: Array[String]): Unit = {
    println("请输入一个Int")
    val a=StdIn.readInt()
    a match {
      case x if x>0 &&x<=3=>println("[0,3]")
      case y if y>=4 &&y<=8=>println("[4,8]")
      case _=>println("未匹配")
    }
  }
}
