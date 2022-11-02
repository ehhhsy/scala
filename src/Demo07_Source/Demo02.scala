package Demo07_Source

import scala.io.Source

object Demo02 {
  def main(args: Array[String]): Unit = {
//    //创建Source对象，关联数据源文件
//    val source = Source.fromFile("./data/1.txt", "UTF-8")
//    //以字符为单位来读取数据
//    val buffered = source.buffered    //返回是个迭代器
//    //打印读取到的数据，hasNext，next
//    while (buffered.hasNext)print(buffered.next())      //不能用println！！否则一个字符占一行


    //如果文件中的内容较少，我们可以直接把它读取到一个字符串中
    val source = Source.fromFile("./data/1.txt", "UTF-8")
    //将数据读取到一个字符串中
    val s:String=source.mkString
    println(s)
  }
}
