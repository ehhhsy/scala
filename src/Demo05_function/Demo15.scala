package Demo05_function
//并集, 交集, 差集
object Demo15 {
  def main(args: Array[String]): Unit = {
    val list1=List(1,2,3,4)
    val list2=List(3,4,5,6)

    val list3=list1.union(list2)
    println(list3)    //List(1, 2, 3, 4, 3, 4, 5, 6)

    val list4=list1.distinct
    println(list4)    //List(1, 2, 3, 4)

    val list5=list1.intersect(list2)
    println(list5)    //List(3, 4)

    val list6=list1.diff(list2)
    println(list6)  //List(1, 2)

    println("-"*15)
    val l1=List(1,2,4,5)
    val l2=List(4,5,8,9)
    println(l1.union(l2))

    println(l1.intersect(l2))

    println(l1.diff(l2))
  }
}
