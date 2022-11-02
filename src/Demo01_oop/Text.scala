package Demo01_oop

import java.text.SimpleDateFormat
import java.util.Date

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}
import scala.util.control._

object Text {

  var max = 0

  def main(args: Array[String]): Unit = {
    //    def getMax(a:String,b:Int)={
    //      if (a==b.toString) println("一样的") else println(" 不一样")
    //    }
    //    getMax("12",12)
    //  }
    //
    //  def getSum(a:Int=12,b:Int=2)={    //默认参数
    //    a+b
    //  }
    PrintUntil.printSpliter()
    println(new Date())
    var av = DateUtils.DatetoString(new Date(), "yyyy:MM:ss")
    println(av)
    PrintUntil.printSpliter()
    println(DateUtils.StringtoDate("2020年06月09日","yyyy年MM月ss日"))  //Mon Jun 01 00:00:09 CST 2020



  var h=10
    PrintUntil.printSpliter()

    var j=60
    var k=30
    if (h>=j){
      max=if (h>k)h else j
    }else{
      max=if (j>k) j else k
    }
    println(max)
    PrintUntil.printSpliter()
  }
  object DateUtils {
    def DatetoString(Date: Date, template: String) = {
      var sdf = new SimpleDateFormat(template)  //template是规则
      sdf.format(Date)
    }
    def StringtoDate(dateString:String,template:String) ={
      var sdf = new SimpleDateFormat(template)  //template是规则
      sdf.parse(dateString)
    }
    for (i<- 1 to 10) println("hello world")
    for (i<- 1 to 3;j<- 1 to 5) if (j==5)println("*") else print("*")


  //用for打印出能被3整除的数字
    for (i<-1 to 10 if i % 3==0){
      println(i)
    }
  }

  //while
  var i =1
  while(i<=5){
    println("while练习"+i)
    i+=1
  }

  //  break/continue
  PrintUntil.printSpliter()
  breakable{
    for (i<- 1 to 5 )if (i==4) breakable() else println(i)
  }
  PrintUntil.printSpliter()

  //九九乘法表啊
  for (i<- 1 to 9;j<- 1 to i){
    if (j==i) println(s"${j} * ${i} = ${i*j}   ") else print(s"${i} * ${j} = ${i*j}")
  }
  PrintUntil.printSpliter()
  //模拟登录
  var account="itcast"
  var password="itheima"
  breakable{
  for (i<-1 to 3){
    println("请输入账号")
    var s1=StdIn.readLine()
    println("请输入密码")
    var s2=StdIn.readLine()
    if (account==s1){
      if (password==s2){
        println("登录成功")
        break()
      }
    }else{
      println(s"错误，你还有${3-i}次机会")
    }
  }
  }
  PrintUntil.printSpliter()

}
