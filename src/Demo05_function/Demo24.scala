package Demo05_function
//映射
object Demo24 {
  def main(args: Array[String]): Unit = {
    val list=List(1,2,3,4)

    //普通方式
    val list2=list.map((x:Int)=>{("*"*x)})
    println(list2)
    println("-"*12)   //List(*, **, ***, ****)

    //类型推断
    val list3=list.map(x => "*"*x)
    println(list3)
    println("-"*12)   //List(*, **, ***, ****)

    //_下划线
    val list4=list.map("*"*_)
    println(list4)        //List(*, **, ***, ****)
    println("-"*12)

    val l1=List("22","11")
    val l2=l1.map((s:String)=>{Int})
    println(l2)
  }
}
