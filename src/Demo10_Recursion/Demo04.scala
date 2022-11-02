package Demo10_Recursion

import java.io.File

//打印目录文件
//思路
object Demo04 {
  def printFile(dir:File){
    //判断目录是否存在
    if (!dir.exists()){
      println("目录不存在")
    }else{
//    listFiles过去该目录下的所有文件/文件夹的File对象形式
      val listFiles = dir.listFiles()
    for (i<-listFiles){
      //遍历，如果是文件夹，就递归，不是则打印
      if (i.isDirectory) printFile(i) else println(i)
    }
    }
  }

  def main(args: Array[String]): Unit = {
    printFile(new File("D:\\其他工具\\黑马大数据"))
  }
}
