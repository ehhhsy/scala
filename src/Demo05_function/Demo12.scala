package Demo05_function
//flatten 扁平化
object Demo12 {
  def main(args: Array[String]): Unit = {
    val list1=List(List(1,2),List(3),List(4,5))
    println(list1)    //List(List(1, 2), List(3), List(4, 5))

    val list2=list1.flatten
    println(list2)    //List(1, 2, 3, 4, 5)





  }
}
