package Demo05_function

object Demo26_filter {
  def main(args: Array[String]): Unit = {
//    val list1=List(1,2,3,4,5,6,7,8,9)
    val list1=(1 to 9).toList    //List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var list2 =list1.filter(x => x % 2 == 0)    //过滤出所有的偶数

    //简写
    var list3 =list1.filter(_ % 2 == 0)    //过滤出所有的偶数

    println(list2)    //List(2, 4, 6, 8)
  }
}
