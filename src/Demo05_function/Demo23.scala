package Demo05_function
//简写函数定义
object Demo23 {
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3,4)
    list.foreach((x:Int)=>{println(x)})


//    使用类型推断来简化函数定义
      list.foreach(x=>println(x))


//    使用下划线来简化函数定义,只在函数体中出现一次，且没有复杂的使用
      list.foreach(println(_))
  }
}
