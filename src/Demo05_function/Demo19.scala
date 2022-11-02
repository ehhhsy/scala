package Demo05_function
import scala.collection.mutable.Map
//可变Map
object Demo19 {
  def main(args: Array[String]): Unit = {
    val map=Map("张三"->23,"李四"->24)
    map("李四")=30
    print(map)    //Map(张三 -> 23, 李四 -> 30)
  }
}
