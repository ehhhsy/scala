package Demo08_highorderFuntion
//闭包
object Demo04 {
  def main(args: Array[String]): Unit = {
    //定义一个函数, 用来获取两个整数的和, 通过闭包的形式实现
    val x=10
    val getSum=(y:Int)=>{
      x+y
    }
    println(getSum(20))
  }
}
