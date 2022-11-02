package Demo07_Source
import scala.io.Source
//按行读取
object Demo01 {
  def main(args: Array[String]): Unit = {
    //创建Source对象，关联数据源文件
    val source=Source.fromFile("./data/1.txt","UTF-8")//不写编码就默认
    //以行为单位，来读取数据
    val line:Iterator[String]=source.getLines()
    //将读取的数据封装到List列表中
    val list=line.toList
    //打印
    for (i<- list)println(i)
    //关闭
    source.close()
  }
}
