package Demo05_function
import scala.collection.mutable.Set
//可变集
object Demo17 {
  //要导入包
  def main(args: Array[String]): Unit = {
    val set=Set(1,2,3,4)
    set+=5
    set++=Set(6,7,8)
    println(set)

    set-=1
    set--=Set(3,5,7)
    println(set)
  }
}
