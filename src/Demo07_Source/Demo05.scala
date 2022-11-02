package Demo07_Source

import java.io.{File, FileInputStream}

//读取二进制文件
object Demo05 {
  def main(args: Array[String]): Unit = {
    //创建File对象，关联数据源文件
    val file = new File("./data/3.png")
    //创建字节输入流，用来读取数据
    val fileInputStream = new FileInputStream(file)
    //创建字节数组，用来存储读取到的内容（字节）
    val bytes = new Array[Byte](file.length().toInt)  //官方推荐写法，数组长度=文件的长度
    //开始读取，将读取到的数据存储到字节数组中，并返回读取到的有效字节数
    val length = fileInputStream.read(bytes)
    //打印结果

    //打印读取到的有效字节数
    println("读取到的有效字节是"+length)

    //关闭字节输入流
    fileInputStream.close()
  }
}
