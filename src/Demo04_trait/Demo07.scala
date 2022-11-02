package Demo04_trait
//使用trait实现模板方法模式

object Demo07 {
  //模板类，添加code()和getRuntime()方法, 用来获取某些代码的执行时间.
  abstract class Template(){
    def code()    //code 方法 由子类决定
    def getRuntime()={
      val start=System.currentTimeMillis()  //获取当前毫秒值
      code()    //代码
      val end=System.currentTimeMillis()    //获取当前毫秒值
      end-start
    }

  }
  class ForDemo extends Template{
    override def code(): Unit = {
      for(i<- 1 to 10000){
        println("Hello,Scala")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    var forDemo=new ForDemo
    println(forDemo.getRuntime()) //50毫秒
  }
}
