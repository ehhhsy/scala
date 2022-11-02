package Demo06_regex

object Demo05 {
  def main(args: Array[String]): Unit = {
    val array1=Array(1,2,3)
    val array2=Array(0)
    val array3=Array(1,2,3,4,5)

    array3 match {
      case Array(1,x,y) =>println(s"长度为3的数组，第一个元素是1,第二个是${x},第三个是${y}")
      case Array(0) =>println("长度为0,元素只有一个0的数组")
        //下划线表示：任意数据，*表示多个
      case Array(1,_*)=>println("长度任意，第一个元素是1的数组")
    }
  }
}
