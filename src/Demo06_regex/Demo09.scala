package Demo06_regex

object Demo09 {
  def main(args: Array[String]): Unit = {
    val map =Map("张三"->23,"李四"->24,"王五"->23,"赵6"->26)

    //通过if语句实现
    for ((k,v)<- map if v==23)println(k,v)


    //通过固定值实现 重点
    for((k,23)<-map)println(k,23)
  }
}
