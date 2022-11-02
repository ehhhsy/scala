package Demo02_extends

object Demo07 {
  abstract class Person{
    val occuption:String
  }
  class teacher extends Person{
    override val occuption: String = "老师"
  }
  class student  extends Person{
    override val occuption: String = "学生"
  }

  def main(args: Array[String]): Unit = {
    val a=new student
    println(a.occuption)
    val b=new teacher
    println(b.occuption)
  }

}
