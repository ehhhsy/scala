package Demo02_extends

//方法重写
object Demo03 {
  class Person{
    val name="张三"
    var age=23

    def sayBye()=println("bye，byte")
  }
  class  students extends Person{
//    override var name="谷歌"      //这样报错 因为父类使用var修饰的，子类不能重写
    override val name="谷歌"
    override def sayBye(): Unit = {
      super.sayBye()
      println("gggboy-students")

      var aq=new AQ
      aq.abc()

      var aq2:Student=new AQ
      if (aq2.isInstanceOf[Student]){
        aq.asInstanceOf[Student]
      }
    }
  }

  def main(args: Array[String]): Unit = {
    var s =new students
    println(s.name,s.age)
    s.sayBye()
  }

  abstract class Student(){
     def abc()
  }
  class AQ extends Student{
    override def abc(): Unit = println("AQ---ggg")
  }
}
