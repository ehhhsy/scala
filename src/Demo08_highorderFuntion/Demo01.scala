package Demo08_highorderFuntion

//演示函数可以作为对象传递
object Demo01 {
  def main(args: Array[String]): Unit = {
    val list = (1 to 10).toList

    //定义函数对象，用来将Int->String
    val func = (x: Int) => {
      "*" * x
    }

    //调用map方法，将第一步的列表转化成目标列表，函数作为map的对象
    val list2 = list.map(func)

    println(list2)
  }
}
