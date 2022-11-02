package Demo07_Source

import java.io.{FileInputStream, FileOutputStream}

//写入数据
object Demo06 {
  def main(args: Array[String]): Unit = {
    //创建字符输出流对象，关联目的地文件
    val fileInputStream = new FileOutputStream("./data/4.txt")  //会自动创建
    //直接写内容
    fileInputStream.write("键盘敲烂,\t\n".getBytes())
    fileInputStream.write("月薪过亿！".getBytes())
    //关流
    fileInputStream.close()
  }
}
