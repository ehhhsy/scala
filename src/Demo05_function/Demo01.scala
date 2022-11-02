package Demo05_function
object Demo01 {
  def main(args: Array[String]): Unit = {
//    定义一个长度为10的整型数组, 设置第1个元素为11, 并打印第1个元素.
    var array1=new Array[Int](10)
    array1(0)=11
    println(array1(0))

//    定义一个包含"java", "scala", "python"这三个元素的数组, 并打印数组长度.
    var array2=Array("java","python","scala")
    println(array2.length)
    for (i<- 0 to array2.length-1)println(array2(i))



  }
}
