package Demo03_package
//样例类的默认方法
object Demo06 {
  case class Person(name:String,age:Int)

  def main(args: Array[String]): Unit = {
//    1.apply
    val person =Person("张三",23)

//    2.toString
    println(person) //Person(张三,23)

//    3.equals() 和java相反
    println(person.age==23) //true

//    4.hashCode()  同一个对象哈希值相同
    println(person.hashCode())    //2077529024

//     5.copy()
    val person2=person.copy(age=299)
    println(person2)          //Person(张三,299)

    //ununapply()后面解释
  }
}
