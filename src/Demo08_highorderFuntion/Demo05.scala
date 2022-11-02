package Demo08_highorderFuntion
//控制抽象
object Demo05 {
  def main(args: Array[String]): Unit = {
    val myShop=(f1:()=>Unit)=>{
      println("Welcome in")
      f1() //表示客户具体购买的商品
      println("Thanks For Coming")
    }
  myShop{       //注意：接收一个无参无返回值的函数
    //这是一个匿名，无参。无返的函数
    ()=>{
      println("买了鸡蛋")
      println("买了大米")
      println("买了西红柿")
    }
  }
  }
}
