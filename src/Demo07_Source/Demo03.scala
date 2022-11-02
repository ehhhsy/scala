package Demo07_Source

import scala.io.Source

//读取词法单元和数字
object Demo03 {
  def main(args: Array[String]): Unit = {
    //获取数据源对象
    val source = Source.fromFile("./data/2.txt", "UTF-8")
    //切割成字符串数组
    val stringsArray:Array[String] = source.mkString.split("\\s+") //   \s 表示空白字符（包括 空格，\t，\r，\n）
    //将字符串转为Int
    val intsArray:Array[Int] = stringsArray.map(x => x.toInt+1)
    //遍历
    for (i<-intsArray)println(i)
    //关对象
    source.close()
  }
}
