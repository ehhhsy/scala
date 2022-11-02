package Demo05_function

import jdk.nashorn.internal.ir.LiteralNode.PrimitiveLiteralNode

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Test {
  def main(args: Array[String]): Unit = {
    val list1=List(("张三",37,90,100), ("李四",90,73,81), ("王五",60,90,76), ("赵六",59,21,72), ("田七",100,100,100))
    val list2=list1.filter(x=>x._2>=60)
    val list3=list2.map(x=>x._1->(x._2+x._3+x._4))
    println(list3)
    val list4=list3.sortBy(x=>x._2).reverse
    println(list4)
  }
}




