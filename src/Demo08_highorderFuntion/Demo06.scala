package Demo08_highorderFuntion
//案例：计算器
object Demo06 {
  def main(args: Array[String]): Unit = {
    def Calculator(x:Int,y:Int)(f1:(Int,Int)=>Int)=f1(x,y)

    println(Calculator(10, 20)(_ + _))
    println(Calculator(10, 20)(_ - _))
    println(Calculator(10, 20)(_ * _))
    println(Calculator(10, 20)(_ / _))
  }
}
