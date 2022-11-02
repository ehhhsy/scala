package Demo03_package

import java.util

import scala.collection.mutable
//案例：演示包的引入

object Demo04 {
  def main(args: Array[String]): Unit = {
//    1. 需求1: 导入java.util.HashSet类.
    import java.util.HashSet
    val hashSet=new util.HashSet[String]()
    hashSet.add("222")
    hashSet.add("3333")
    println(hashSet)
//    2. 需求2: 导入java.util包下所有的内容
    import java.util._
    var hashMap =new util.HashMap[Int,String]()   //导入了所有内容，自然就有HashMap
    hashMap.put(1,"张三")
    hashMap.put(2,"李四")
    println(hashMap)

//    3. 需求3: 只导入java.util包下的ArrayList类和HashSet类
    import java.util.{ArrayList,HashSet}

//    4. 需求4: 通过重命名的方式, 解决多个包中类名重复的问题
//    import java.util.{HashSet=>JavaHashSet}
//    import scala.collection.mutable.HashSet
//    var jsh=new JavaHashSet[String]()
//    println(jsh.getClass) //class java.util.HashSet


//    5.  需求5: 导入时, 隐藏某些不需要用到的类, 即: 导入java.util包下除了HasSet和TreeSet之外所有的类.
    import java.util.{HashSet=>_,_}   //导入java.util包下除了HasSet之外所有的类.
    import java.util.{HashSet=>_,_}   //导入java.util包下除了HasSet和TreeSet之外所有的类.
    import scala.collection.mutable.HashSet
    var a= new mutable.HashSet[String]()
  }
}
