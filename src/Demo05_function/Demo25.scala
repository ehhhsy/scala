package Demo05_function
// 扁平化映射
object Demo25 {
  def main(args: Array[String]): Unit = {
    val list1=List("hadoop,hive,spark,fink,flume","kudu,hbase,sqoop,storm")
    //方式1 先map 在flatten
    val list2=list1.map((x:String)=>{x.split(" ")}) //List(Array("hadoop","hive"),Array("kudu","hbase"))
    println(list2)    //List([Ljava.lang.String;@80ec60, [Ljava.lang.String;@13afe78)
    val list3=list2.flatten
    println(list3)    //List(hadoop,hive,spark,fink,flume, kudu,hbase,sqoop,storm)


    //方式2 直接通过flatMap
//    val list4=list1.flatMap((x:String)=>{x.split(" ")})

//    优化
    val list4=list1.flatMap(x=>x.split(" "))

//    在优化
    val  list5=list1.flatMap(_.split(" "))
    println(list4)    //List(hadoop,hive,spark,fink,flume, kudu,hbase,sqoop,storm)
  }
}