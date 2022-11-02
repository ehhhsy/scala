package Demo09_Implicit

import scala.collection.mutable

//案例：获取所有列表元素的平均值
object Demo05 {
  case class RichList(list: List[Int]){
    def avg() ={
    if (list.size==0)None
    else {
      Some(list.sum/list.size)
    }
    }
  }
  def main(args: Array[String]): Unit = {
    implicit def a(list:List[Int])=new RichList(list)

  val list=(1 to 5).toList
    println(list.avg())
  }
}
