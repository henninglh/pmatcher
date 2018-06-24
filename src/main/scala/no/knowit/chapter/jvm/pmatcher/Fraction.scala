package no.knowit.chapter.jvm.pmatcher

object Fraction {
  def main(args: Array[String]): Unit = {
    // withoutPartialFunction()
    withPartialFunction()
  }


  def withoutPartialFunction(): Unit = {
    val theAnswerOfLife = fraction(0)
    println(theAnswerOfLife)
  }

  def fraction(d: Int): Int = 42 / d

  def withPartialFunction(): Unit = {
    val fractionPf = new PartialFunction[Int, Int] {
      def apply(d: Int): Int = {
        42 / d
      }

      override def isDefinedAt(d: Int): Boolean = {
        d != 0
      }
    }

    println("is it defined with the number 2? " + fractionPf.isDefinedAt(2))
    println("what is the result? " + fractionPf(2))
  }
}
