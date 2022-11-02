package Demo06_regex
// 匹配list
object Demo06 {
  def main(args: Array[String]): Unit = {
    val list1=List(0)
    val list2=List(0,1,2,3,4,5)
    val list3=List(66,22)

    list1 match {
      case List(x, y) => println("只有2个元素的list")
      case List(0) => println("只有一个0的list")
      case List(0, _*) => println("以0开头的任意多个元素的List")
      case _ => println("未匹配")


    }
//   思路2 Nil, tail
     list1 match {
       case 0::Nil => println("只有2个元素的list")
       case 0::tail=> println("只有一个0的list")
       case x::y::Nil=>  println("以0开头的任意多个元素的List")
       case _ => println("未匹配")
     }
  }
}
