package Demo06_regex

object Demo15 {
  def main(args: Array[String]): Unit = {
    val list1 = List("38123845@qq.com", "a1da88123f@gmail.com", "zhansan@163.com", "123afadff.com"
    )
    val regex = """.+@(.*?)\..+""".r
    //通过模式匹配，获取邮箱的运营商
    //x表示emailList列表中的每一个邮箱：38123845@qq.com -> "qq"   123afadff.com -> 未匹配

    val list2 = list1.map {
      //            case:固定格式
      //      x:每一个
      //      @:固定格式
      //      regex(company)：正则对象
      //      =>
      //      x->company  邮箱->运营商

      case x@regex(company) => x -> company
      case x => x -> "未匹配"
    }
    println(list2)
  }
}
