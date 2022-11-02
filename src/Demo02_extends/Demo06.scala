package Demo02_extends

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

object Demo06 {
  abstract class Shape{
    def area():Double
  }
  //长方形
  class rectangle(var length:Double,var width:Double) extends Shape {
    override def area(): Double = {
      length*width
    }
  }
  //正方形
  class Square(var edge:Double) extends Shape{
    override def area():Double={
      edge*edge
    }
  }
  //圆形
  class Circle(var raius:Double) extends Shape{
    override def area(): Double = {
      Math.PI*raius*raius         //Math.PI == 兀
    }
  }
  def main(args: Array[String]): Unit = {
    PrintUntil.printSpliter()
    var rectangle=new rectangle(2,6)  //长方形
    println(rectangle.area())
    PrintUntil.printSpliter()
    var Square =new Square(5)                 //正方形
    println(Square.area())
    PrintUntil.printSpliter()
    var Circle=new Circle(9)                    //圆形
    println(Circle.area())
  }
}
