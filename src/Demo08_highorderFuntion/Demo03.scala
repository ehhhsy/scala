package Demo08_highorderFuntion
//柯里化。定义一个方法，实现2个字符串拼接
object Demo03 {
  def main(args: Array[String]): Unit = {
    //普通写法
    def a(x:String,y:String)=x+y

    //柯里化写法
    //f1表示函数，这里函数是把两个字符串转换成一个字符串
    def b(x:String,y:String)(f1:(String,String)=>String)=f1(x,y)

    val str2=b("aa","bb")(_+_)    //普通拼接
    val str3=b("aa","bb")((x,y)=>x.toUpperCase()+y)    //x大写 +y
    println(str3)
  }
}
