package Demo02_extends

// isInstanceOf, asInstanceOf 类型推断
object Demo04 {
  def main(args: Array[String]): Unit = {
    var s:Person =new students        //多态
    if (s.isInstanceOf[students]) { //返回值boolean,判断s是否为students类型
      var s2 = s.asInstanceOf[students] //将p 转化为 students
      s2.sayHello()
    }
  }
  class Person{}
  class students extends Person {
    def sayHello()=println("hello")
  }
}
