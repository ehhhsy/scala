package Demo03_package
//计算器
object Demo08_Calculator {
  case class Calculater(one:Double,two:Double){
    def add()=one+two         //加
    def Subtraction()=one-two //减
    def Multiply()=one*two    //乘
    def division()=one/two    //除
  }
  def main(args: Array[String]): Unit = {
    val calculater=Calculater(20,30)
    println(("加法:\t")+calculater.add())
    println(("减法:\t")+calculater.Subtraction())
    println(("乘法:\t")+calculater.Multiply())
    println(("除法:\t")+calculater.division())
  }
}
