package Demo01_oop

//伴生对象
object ClassDemo11 {
    class Generals{
      def toWar(): Unit ={
        println(s"武将拿着${Generals.war}, 上阵杀敌!")
      }
    }
    object Generals{
      private var war="雷神-赛博朋克"
    }

  def main(args: Array[String]): Unit = {
    var G=new Generals
    G.toWar()

    var gun=new gun
    gun.useGun()    //我用AK47-B,开枪
  }

  class gun{
    def useGun(): Unit ={
      println(s"我用${gun.gun},开枪")
    }
  }
  object gun{
    var gun="AK47-B"
  }
  object aaa{
    var a="嘎嘎嘎"
  }
}
