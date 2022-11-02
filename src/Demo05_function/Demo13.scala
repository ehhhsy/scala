package Demo05_function
//拉链 拉开
object Demo13 {
  def main(args: Array[String]): Unit = {
    val names=List("张三","李四","王五")
    val ages=List(23,24,25)

    val list1=names.zip(ages)
    println(list1)      //List((张三,23), (李四,24), (王五,25))

    val tuple1=list1.unzip
    println(tuple1) //(List(张三, 李四, 王五),List(23, 24, 25))

    val a=List(List(1),List(5),List(33))
    val b=a.flatten
    println(b)    //List(1, 5, 33)

    val a2=List("张三","王晓")
    val c=List(22,21)
    val b2=a2.zip(c)
    println(b2)
    val c2=b2.unzip
    println(c2)

    var a3=a2.mkString("!")
    println(a3)
  }
}
