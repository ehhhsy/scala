package Demo10_Recursion
//即: 已知数列1, 1, 2, 3, 5, 8, 13..., 问: 第12个数字是多少?
//分析：
//  出口：第一个月和第二个月的兔子对数都是1
//  规律：从第三个月开始，每月的兔子对数=它前两个的兔子对数之和
object Demo03 {

  def rabblit(month:Int):Int={
  //出口
  if( month==1 || month==2) 1
  //规律
  else rabblit(month-1) + rabblit(month-2)
  }
  def main(args: Array[String]): Unit = {
    //调用
  val result=rabblit(12)
    println(result)
  }
}
