package no.knowit.chapter.jvm.pmatcher

object CurriedNextLevel {
  def main(args: Array[String]): Unit = {
    println("CurriedNextLevel:")
    val primedOnce = curriedLine(5)
    val primedTwice = primedOnce(10)
    val result1 = primedTwice(2)
    val result2 = primedTwice(4)
    println("curried function primed with 5: " + primedOnce)
    println("curried function primed with 10: " + primedTwice)
    println("final result with 2: " + result1)
    println("final result with 4: " + result2)
    println()
  }

  def line(a: Int, b: Int, x: Int): Int = a + x + b

  //def curriedLine: Int => Int => Int => Int = (line _).curried
  def curriedLine: Int => (Int => (Int => Int)) = (line _).curried
}
