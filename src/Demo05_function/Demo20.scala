package Demo05_function

import scala.collection.mutable

//map集合 基本操作
object Demo20 {
  def main(args: Array[String]): Unit = {
    val map=mutable.Map("张三"->23,"李四"->24)

    println(map("张三"))    //23

    println(map.keys)   //Set(张三, 李四)

    println(map.values)   //MapLike(23, 24)

    for ((key,value)<- map)println(s"${key}:${value}")// 张三:23 李四:24

    println(map.getOrElse("王五",-1)) //如果王五找不到，就返回-1

    map+="王五"->25
    println(map)    //Map(王五 -> 25, 张三 -> 23, 李四 -> 24)

    map-="李四"
    println(map)    //Map(王五 -> 25, 张三 -> 23)
  }
}
