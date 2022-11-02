package Demo05_function

object Demo29_sortWith {
  def main(args: Array[String]): Unit = {
    val list1=List(2,3,1,6,4,5)
    val list2=list1.sortWith((A,B)=>A>B)    //A>B 降序

    //精简
    val list3=list1.sortWith(_>_)
    println(list2)  //List(6, 5, 4, 3, 2, 1)
    println(list3)  //List(6, 5, 4, 3, 2, 1)
  }
}
