package Demo06_regex

object Demo14 {
  def main(args: Array[String]): Unit = {
    val list1=List( "38123845@qq.com", "a1da88123f@gmail.com", "zhansan@163.com", "123afadff.com"
    )
    val regex=""".+@.+\..+""".r
    val list2=list1.filter(x=>regex.findAllMatchIn(x).size==0) //非法邮箱
    val list3=list1.filter(x=>regex.findAllMatchIn(x).size!=0) //合法邮箱
    println(list2)
    println(list3)
  }
}
