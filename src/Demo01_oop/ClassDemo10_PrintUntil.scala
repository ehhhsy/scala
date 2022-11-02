package Demo01_oop

//单例对象.方法
object ClassDemo10_PrintUntil {
  def main(args: Array[String]): Unit = {
    PrintUntil.printSpliter()       //静态对象.静态方法
    PrintUntil2.Print67()
  }
  //定义一个单例对象
  object PrintUntil{
    def printSpliter()= println("="*161)
  }

  object PrintUntil2{
    def Print67() =println("67-67-67-67-67-67-67-67-67-67-67-67")
  }
}
