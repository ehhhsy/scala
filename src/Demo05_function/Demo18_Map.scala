package Demo05_function
//map 映射
object Demo18_Map {
  def main(args: Array[String]): Unit = {
    val map1 =Map("张三"->23,"李四"->24,"李四"->40)
    println(map1)   //Map(张三 -> 23, 李四 -> 40)

    val map2=Map(("张三",23),("李四",24))
  }
}
