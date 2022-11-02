package Demo05_function
//不可变列表
object Demo08_list {
  def main(args: Array[String]): Unit = {
    val list1=List(1,2,3,4,5)

    val list2=Nil

    val list3= -2 :: -1 :: Nil

    println(list1,list2,list3)  //(List(1, 2, 3, 4, 5)  List()   List(-2, -1))

    val list4=List("黄慧婷",55)

    val list5=Nil
    val List6= -2 :: 22 :: Nil
    println(List6)
  }
}
