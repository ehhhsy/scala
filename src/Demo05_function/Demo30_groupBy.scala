package Demo05_function

object Demo30_groupBy {
  def main(args: Array[String]): Unit = {
    val list1 = List("刘德华" -> "男", "刘亦菲" -> "女", "胡歌" -> "男")
    //    val map1=list1.groupBy[String](x=>(x._2))

    //优化
    val map1 = list1.groupBy(_._2)

    println(map1) //Map(男 -> List((刘德华,男), (胡歌,男)), 女 -> List((刘亦菲,女)))

    //统计不同性别的学生人数
    //x表示map1集合中的每个元素，格式： 男 -> List((刘德华,男), (胡歌,男))    元组格式->
    //x._2 是一个list ，list的长度正好是 学生的人数
    //    val map2=map1.map(x=>x._1 -> x._2.size)

    //优化  不能用_优化，因为出现了两次x！！！！
    val map2 = map1.map(x => x._1 -> x._2.size)

    println(map2) //Map(男 -> 2, 女 -> 1)
  }
}
