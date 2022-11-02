package Demo10_Recursion
//阶乘
object Demo02 {
  def factorial(n:Int):Int={
    if (n==1) 1 else n * factorial(n-1)
  }
  def main(args: Array[String]): Unit = {
    println(factorial(5))

  }
}
