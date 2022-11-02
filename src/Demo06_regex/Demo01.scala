package Demo06_regex
//简单模式匹配
import scala.io.StdIn
object Demo01 {
  def main(args: Array[String]): Unit = {
    println("请输入一个单词")
    val a = StdIn.readLine()
    a match {
      case "hadoop" => println("大数据分布式存储和计算框架")
      case "zookeeper" => println("大数据分布式协调服务框架")
      case "spark" => println("大数据分布式内存计算框架")
      case _ => println("未匹配")

    }
      //可以拿返回值接收
        val bb = a match {
          case "hadoop" => "大数据分布式存储和计算框架"
          case "zookeeper" => "大数据分布式协调服务框架"
          case "spark" => "大数据分布式内存计算框架"
          case _ => "未匹配"
        }
  }
}
