package Demo06_regex
//0ption
object Demo10_Option {
  def main(args: Array[String]): Unit = {
  val a=divider(10,2)
    println(a)  //5
  //普通实现
  val b=divider(10,0)
  println(b)
//----------------------------------------
  //通过模式匹配实现a
   b match {
    case Some(x)=>println("商为"+x)
    case None=>println("除数不能为0")
  }

  //----------------------------------------
  //通过getorElse（）方法实现
  println(b.getOrElse("除数不能为0"))
  }
  def divider(a:Int,b:Int) ={
    if (b==0){
      None
    }else{
      Some(a/b)
    }
  }
}
