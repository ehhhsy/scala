package Demo06_regex
//模式匹配
object Demo08 {
  def main(args: Array[String]): Unit = {
    val array=(0 to 10).toArray
    val list=(0 to 10).toList

    val Array(_,x,y,z,_*)=array //匹配

    println(x,y,z)    //(1,2,3)

    val List(a,b,_*)=list      //匹配
    println(a,b)    //(1,2,3)
    (0,1)
  }
}
