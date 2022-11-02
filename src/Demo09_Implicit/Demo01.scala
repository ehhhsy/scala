package Demo09_Implicit

import java.io.File

import scala.io.Source

//隐式转换，手动导入
object Demo01 {
  //1.定义RichFile类，用来丰富File类的功能
  class RichFile(file: File){
    def read()=Source.fromFile(file).mkString
  }

  //2.定义单例对象ImplicitDemo，改单例对象有一个 隐式转换方法
  object  ImplicitDemo{
    //隐式转化方法fILE2RichFile，用来将File对象转化为RichFile对象
    implicit def file2RichFile(file:File)=new RichFile(file)
  }


  //3.核心：手动导入隐式转化
  import ImplicitDemo.file2RichFile

  //4.创建普通的File对象，尝试调用其read功能
  def main(args: Array[String]): Unit = {
    val file = new File("./data/1.txt")
    println(file.read())


    /*
    执行流程：
    1.先找File类有没有read（）方法，有就用
    2.没有就去，查看有没有该类型的隐式转换，将该对象转成其他类型的对象
    3.如果没有隐式转换，直接报错
    4. 如果可以转换，就看出转换后的对象有没有指定方法，有，不报错， 没有，报错
     */
  }
}
