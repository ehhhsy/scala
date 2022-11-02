package Demo09_Implicit
//隐式参数:如果方法的某个参数使用了implicit修饰，则该参数列表就是：隐式参数
//好处：我们调用方法时，隐式参数是不需要给值的，因为编译器会自动去查找缺省值，然后提供给方法
object Demo03 {
  //定义一个show方法,前缀和后缀都是通过隐式参数的形式实现的
  def show(string: String)(implicit s:(String,String)): String =s._1+string+s._2

  //定义一个单例对象，用来给隐式参数设置默认赠
  object a{
    implicit val s=("<<<",">>>")
  }
  def main(args: Array[String]): Unit = {
    //手动导入：隐式参数的值
    import a.s
    val str = show("路飞")
    println(str)  //<<<路飞>>>
  }
}
