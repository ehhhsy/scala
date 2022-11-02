package Demo07_Source

import scala.io.Source

//从URL或者其他地方读取数据
object Demo04 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromURL("http://www.itcast.cn/")
    println(source.mkString)

    val source1 = Source.fromString("黑马程序员")
    println(source1.mkString)   //黑马程序员
  }
}
