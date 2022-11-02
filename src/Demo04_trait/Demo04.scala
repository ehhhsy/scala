package Demo04_trait

object Demo04 {
  //一个特质 Hero
  trait Hero{
    var name=""
    var arms:String
    def eat()={
      println("吃饭")
    }
    def toWar()
  }
  //Generals类
  class Generals extends Hero(){
    override def toWar(): Unit = println(s"${name}拿着${arms},去打仗")

    override var arms: String = "黄金M249"
  }

  def main(args: Array[String]): Unit = {
    var g=new Generals
    g.name="关羽"
    g.eat()
    g.toWar()
  }
}
