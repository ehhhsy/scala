package Demo05_function

object Demo31_reduce {
  def main(args: Array[String]): Unit = {
    val list1 = (1 to 10).toList
    //reduce
    //x:聚合后的结果
    //y:要聚合的元素
    val sum = list1.reduce(op = (x, y) => x + y)
    //    优化
    val sum2 = list1.reduce( _+_)
    println(sum2)


    println("-"*15)
    //减法
    var sum1=list1.reduce(_-_)
    //1-2-3-4-5-6-7-8-9-10

    //reduceRiget
    //x:要聚合的元素
    //y:聚合的结果
    var sum3=list1.reduceRight(_-_)
    //9 -  10  -1
    //8 - -1    9
    //7 -  9    -2
    //.....
  }
}
