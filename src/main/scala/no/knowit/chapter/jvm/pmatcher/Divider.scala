package no.knowit.chapter.jvm.pmatcher

object Divider {
  def main(args: Array[String]): Unit = {
    faultyDivide()
    workingDivide()
    workingDivide2()
  }

  def faultyDivide(): Unit = {
    val divide = (d: Int) => 42 / d
    divide(0)
  }

  def workingDivide(): Unit = {
    val divide = new PartialFunction[Int, Int] {
      def apply(d: Int): Int = 42 / d

      override def isDefinedAt(d: Int): Boolean = {
        d != 0
      }
    }

    println("isDefinedAt(1): " + divide.isDefinedAt(1))
    println("isDefinedAt(0): " + divide.isDefinedAt(0))
    println("divided by 2: " + divide(2))
  }

  def workingDivide2(): Unit = {
    val divide: PartialFunction[Int, Int] = {
      case d: Int if d != 0 => 42 / d
    }

    println("isDefinedAt(1): " + divide.isDefinedAt(1))
    println("isDefinedAt(0): " + divide.isDefinedAt(0))
    println("divided by 2: " + divide(2))
  }
}
