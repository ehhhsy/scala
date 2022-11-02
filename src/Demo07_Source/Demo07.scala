package Demo07_Source

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

//序列化/反序列化
object Demo07 {
  def main(args: Array[String]): Unit = {
    val person = Person("ss", 22)
    //演示序列化
    //创建序列化流，用来将对象写入文件中
    val objectOutputStream = new ObjectOutputStream(new FileOutputStream("./data/5.txt"))
    //调用writerObject,将对象写入到文件中
    objectOutputStream.writeObject(person)
    //关流
    objectOutputStream.close()

//    -------------------------------------
//    演示反序列化
    //创建反序列化流，关联数据源文件
val objectIutputStream = new ObjectInputStream(new FileInputStream("./data/5.txt"))
    //调用readObject（）从数据源文件中读取指定的对象
    //小细节：我们获取到的是AnyRef类型，所以要转化为Person类型
    val person1 = objectIutputStream.readObject().asInstanceOf[Person]
    println(person1.name,person1.age)
    //关流
    objectIutputStream.close()
  }
  case class Person(name:String,age:Int) extends Serializable
}
