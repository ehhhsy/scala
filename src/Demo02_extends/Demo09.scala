package Demo02_extends

import Demo01_oop.ClassDemo10_PrintUntil.PrintUntil

object Demo09 {
    abstract class Animal{
      val name:String
      val age:Int
      def run(): Unit = println("跑步")
      def eat()
    }

  class Cat extends Animal{
    override val name: String = "大猫"
    override val age: Int = 4


    override def eat(): Unit = println(s"${age}岁的${name}吃东西")

    def Catch_mice()=println(s"${age}岁的${name}抓老鼠")
  }
  class Dog extends Animal{
    override val name: String = "哈士奇"
    override val age: Int = 5
    override def eat(): Unit = println(s"${age}岁的${name}吃东西")

    def Watch_house()=println(s"${age}岁的${name}在看家")
  }
  def main(args: Array[String]): Unit = {
    new Cat{
      run()
      eat()
      Catch_mice()
    }
    PrintUntil.printSpliter()
    new Dog{
      run()
      eat()
      Watch_house()
    }
  }
}
