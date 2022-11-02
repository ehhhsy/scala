package Demo07_Source

import java.io.{BufferedWriter, FileOutputStream, FileWriter}

import scala.collection.mutable.ListBuffer
import scala.io.Source

object Demo08 {
  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("./data/student.txt", "UTF-8")
    //读取文件所以的数据，并封装到数组中
    val stuArray = source.getLines().map(_.split(" "))
    //定义可变的列表ListBuffer[Student],用来记录所有学生的信息
    val listBuffer = new ListBuffer[Student]
    //for遍历获取到了数据，并将其封装成Student类的对象后，并添加到ListBuffer中
    for (i<-stuArray){
      //s就是每一个学生的信息：Array（"张三"，"37"，"90"，"100"）,Array（"李四"，"90"，"73"，"81")
    listBuffer+=new Student(i(0),i(1).toInt,i(2).toInt,i(3).toInt)
    }
    val sortlist=listBuffer.sortBy(_.getSum()).reverse.toList   //每一个student对象调用getSum方法，在sortby升序，在reverse反转变成降序，在toList

    //写入指定的文件中，通过BufferedWriter（是一个高效的字符输出流也叫字符缓冲流，FileWriter是普通的字符输出流）
    val bw = new BufferedWriter(new FileWriter("./data/stu.txt"))
    for (s<-sortlist){
      //s表示：排序后的每一个学生的信息：Student(田七,100,100,100)
      bw.write((s"${s.name} ${s.Chinese} ${s.math} ${s.English} ${s.getSum()}"))
      bw.newLine()//换行功能

    }//关流
      bw.close()
      source.close()

  }
  case class Student(name:String, Chinese:Int, math:Int, English:Int){
    def getSum(): Int ={
      Chinese+math+English
    }
  }
}
