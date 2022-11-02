package Demo01_oop

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

//案例：如何创建单例对象
object ClassDemo09 {
  def main(args: Array[String]): Unit = {
    println(Dog.leg)
    println(cat.soul)
    PrintUntil.printSpliter()
    println(hht.jiao)
    println(hht.ku())
  }
  object Dog{     //静态变量
    var leg=10
  }
  object cat{
    var soul="喵喵喵"
  }
  object hht{
    var jiao="嗷嗷嗷"
    def ku()=println("呜呜呜")
  }
}
