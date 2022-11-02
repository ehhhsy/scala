package Demo06_regex
//异常
object Demo16_Exception {
  def main(args: Array[String]): Unit = {
//    try {
//      val a = 10/0
//    }catch {
//      case ex:Exception=>ex.printStackTrace() //将异常信息，打印到控制台上
//      case ex:ArithmeticException=>println("算术异常")
//    }finally {
//      println("后续代码")         //try catch finally
//    }
//    println("....")



  //抛出异常
    throw new Exception("我是一个异常")
    println("后续代码")
  }
}
