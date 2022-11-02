package Demo05_function


object Demo33 {
  def main(args: Array[String]): Unit = {
    //    1.  定义列表, 记录学生的成绩, 格式为: 姓名, 语文成绩, 数学成绩, 英语成绩,
    val list1 = List(("张三", 37, 90, 100), ("李四", 90, 73, 81), ("王五", 60, 90, 76), ("赵六", 59, 21, 72), ("田七", 100, 100, 100))

    //    2. 获取所有语文成绩在60分(含)及以上的同学信息.
    val list2=list1.filter(x=>x._2>=60)

    //    3.  获取所有学生的总成绩.
    val list3=list2.map(x=>x._1->(x._2+x._3+x._4))   // //List((李四,244), (王五,226), (田七,300))

    //    4. 按照总成绩降序排列f
    //方式1
    val list4=list3.sortBy(x=>x._2)
    var list5=list4.reverse

    //方式2
    var list6=list3.sortWith((x,y)=>x._2>y._2)
    println(list6)      //List((田七,300), (李四,244), (王五,226))
  }
}
