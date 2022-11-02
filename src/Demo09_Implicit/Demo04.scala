package Demo09_Implicit
//自动导入隐式参数
object Demo04 {
  def show(name:String)(implicit t1:(String,String)):String=t1._1+name+t1._2

  def main(args: Array[String]): Unit = {

    implicit val s=("<<<",">>>")

  println(show("aa")) //<<<aa>>>
  }
}
