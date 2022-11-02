package Demo06_regex
//匹配样例类
object Demo04 {
  def main(args: Array[String]): Unit = {
    def main(args: Array[String]): Unit = {
      val customer:Any=Customer("张三",33)
      customer match {
        case Customer(name,age)=>println("Custmor类型的对象"+name+age)    //要和定义的样例类保持一致
        case order(id)=>println("order类型的对象"+id)    //要和定义的样例类保持一致
        case _=>println("未匹配")
      }
    }
  }
  case class Customer(var name:String,var age:Int)
  case class order(var id:Int)

}
