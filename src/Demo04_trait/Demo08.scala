package Demo04_trait
//需求
//通过Scala代码, 实现一个模拟支付过程的调用链.
object Demo08 {

  trait Handler {
    def handle(data: String): Unit = {
      println("支付成功")
    }
  }

  trait DataValidHandler extends Handler {
    override def handle(data: String): Unit = {
      println("数据校验")
      super.handle(data)
    }
  }

  trait SignatureValidHandler extends Handler {
    override def handle(data: String): Unit = {
      println("检查签名")
      super.handle(data)
    }
  }

  class Payment extends DataValidHandler with SignatureValidHandler {
    def pay(data: String): Unit = {
      println("用户发起支付请求")
      super.handle(data)
    }
  }

  def main(args: Array[String]): Unit = {
    var payment = new Payment
    payment.pay("我给转陈冠希300块")
  }
}
//流程:
//    1.payment调用了pay方法,先执行payment的pay方法                          用户发起支付请求
//    2.然后从右到左执行,先执行SignatureValidHandler,在执行DataValidHandler   数据校验    检查签名
//    3.最后执行Handler                                                    支付成功
//