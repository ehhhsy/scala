package Demo05_function

object Demo32_fold {
  def main(args: Array[String]): Unit = {
    val list1=(1 to 10).toList
    val sum1=list1.fold(100)((x,y)=>x+y)
    println(sum1)

    //foldRight
    val sum2=list1.foldRight(100)((x,y)=>x+y)
    println(sum2)

    println("---------------减法---------------")
    val sum3=list1.fold(100)((_-_))
    println(sum3)

    //foldRight
    val sum4=list1.foldRight(100)(_-_)
    println(sum4)
  }
}
