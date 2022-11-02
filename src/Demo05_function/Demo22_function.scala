package Demo05_function

object Demo22_function {
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3,4)
    //list.foreacg(函数对象)
    //函数的格式：（函数的参数列表) => {}
    //x表示list中的每个元素
    list.foreach((x:Int)=>println(x))

    //简写版本
    list.foreach(x=>println(x))
  }
}
