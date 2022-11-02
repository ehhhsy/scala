package Demo05_function
//可变列表的操作
import scala.collection.mutable.ListBuffer

object Demo10 {
  def main(args: Array[String]): Unit = {
    val listBuffer =ListBuffer(1,2,3)
    println(listBuffer(0))    //1

    listBuffer+=4
    listBuffer++=ListBuffer(5,6,7)
    println(listBuffer)

    listBuffer-=7
    println(listBuffer)   //ListBuffer(1, 2, 3, 4, 5, 6)

    listBuffer--=ListBuffer(3,4)
    println(listBuffer)  //ListBuffer(1, 2, 5, 6)

    val list=listBuffer.toList
    println(list) //List(1, 2, 5, 6)

    val array=listBuffer.toArray
    for (i<- array)print(i+"\t")    //1	2	5	6


  }

}
