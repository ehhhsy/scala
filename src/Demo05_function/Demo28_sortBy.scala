package Demo05_function

object Demo28_sortBy {
  def main(args: Array[String]): Unit = {
    val list1=List("01 hadoop", "02 flume", "03 hive", "04 spark")
    //x表示 list中的每个元素  "01 hadoop", "02 flume"
    //spilt按照空格切分，的到 Array("01","hadoop"),Array("02","flume")
    //(1) 表示索引为1  "hadoop"  "flume"
    var list2=list1.sortBy[String](x=>x.split(" ")(1))
    println(list2)    //List(02 flume, 01 hadoop, 03 hive, 04 spark)
  }
}
