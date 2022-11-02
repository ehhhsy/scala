package Demo05_function

import scala.collection.mutable.ArrayBuffer

//变长数组的增删改查
object Demo03 {
  def main(args: Array[String]): Unit = {
    var array =ArrayBuffer("hadoop","spark","fink")
    array+="flume"
    println(array)    //ArrayBuffer(hadoop, spark, fink, flume)

    array-="hadoop"
    println(array)    //ArrayBuffer(spark, fink, flume)

    array++=Array("hive","sqoop")
    println(array)    //ArrayBuffer(spark, fink, flume, hive, sqoop)

    array--=Array("sqoop", "spark")
    println(array)    //ArrayBuffer(fink, flume, hive)


    val array2=ArrayBuffer("hadoop","spark","aaa")
    array2+="hhh"
    array2-="aaa"
    array2++=ArrayBuffer("hhh","gugugu")
    array2--=ArrayBuffer("spark","hadoop")
    println("array2 : "+array2)
  }
}
