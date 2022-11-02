package Demo04_trait
//适配器模式
object Demo06 {
  //特质
  trait PlayLOL{
    def top()
    def mid()
    def adc()
    def support()
    def jungle()
    def schoolchild()
  }
  //抽象类Player 适配器
  abstract class Player extends PlayLOL{
    override def top(): Unit = ???
    override def mid(): Unit = ???
    override def adc(): Unit = ???
    override def support(): Unit = ???
    override def jungle(): Unit = ???
    override def schoolchild(): Unit = ???
  }
  //实现类
  class GreenHand extends Player{
    override def support(): Unit = println("曙光，锤石")

    override def schoolchild(): Unit = println("小学生干啥啥不行")
  }

  def main(args: Array[String]): Unit = {
    var greenHand =new GreenHand
    greenHand.support()
    greenHand.schoolchild()
  }
}
