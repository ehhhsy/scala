package Demo06_regex
//regex正则
object Demo13_regex {
  def main(args: Array[String]): Unit = {
    val s1="qq12344@gmail.com"
    val s2="qq12344@.com"
    val rx=""".+@.+[163|qq|gmail]\.[com|cn]""".r    //一个正则对象  写错了

    if(rx.findAllMatchIn(s2).size!=0){ //从s1字符串中，获取所有满足regex规则的字符串
      println("找到了")
    }else{
      println("没找到")
    }

  }
}
