package Demo05_function

object Demo27_sorted {
  def main(args: Array[String]): Unit = {
    val list1=List(3,1,2,9,7)

    //升序
    val list1_sort=list1.sorted
    println(list1_sort)   //List(1, 2, 3, 7, 9)

    //降序
    val list2_sort=list1.sorted.reverse
    println(list2_sort) //List(9, 7, 3, 2, 1)
  }
}
