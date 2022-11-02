package Demo09_Implicit

import java.io.File

import scala.io.Source

//自动导入隐式转换方法
object Demo02 {
  class RichFile(file:File){
    def read(): Unit ={
      val string = Source.fromFile(file).mkString
    }
  }
  def main(args: Array[String]): Unit = {
      implicit def file2Rfile(file:File)=new RichFile(file)

    val file = new File("./data/2.txt")
    println(file.read())
    }
  }
