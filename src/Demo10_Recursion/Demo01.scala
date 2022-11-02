package Demo10_Recursion
//递归入门
/*
1. 递归必须有出口, 否则容易造成 `死递归` .
2. 递归必须要有规律.
3. 构造方法不能递归.
4. 递归方法必有 返回值的数据类型 .
 */

object Demo01 {
  var count = 1
  def show(): Int ={
    println(s"第${count}次调用show（）方法")
    count=count+1
    show()
    1
    //Exception in thread "main" java.lang.StackOverflowError 栈内存溢出
  }
  def main(args: Array[String]): Unit = {
    show()
  }
}
