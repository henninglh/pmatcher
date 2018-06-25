package no.knowit.chapter.jvm.pmatcher

object Curried {
  def main(args: Array[String]): Unit = {
    println("Curried:")
    println("" + defaultLine(5))
    println()
  }

  def line(a: Int, b: Int, x: Int): Int = a * x + b

  def curriedLine(a: Int)(b: Int)(x: Int): Int = line(a, b, x)

  def defaultLine(x: Int): Int = curriedLine(1)(0)(x)

}
