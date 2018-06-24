package no.knowit.chapter.jvm.pmatcher

object Square {
  def main(args: Array[String]): Unit = {
    println()

    val positiveIsDefined = squareRoot.isDefinedAt(2)
    val negativeIsUndefined = squareRoot.isDefinedAt(-2)
    println("The positive number 2 is defined for squareRoot: " + positiveIsDefined)
    println("The negative number -2 is undefined for squareRoot: " + negativeIsUndefined)

    // val evenCheck: PartialFunction[Int, Boolean] = positive.andThen(even) // no spaces between method calls
    val evenCheck: PartialFunction[Int, Boolean] = positive andThen even // spaces between method calls
    // val oddCheck: PartialFunction[Int, Boolean] = positive.andThen(odd) // no spaces between method calls
    val oddCheck: PartialFunction[Int, Boolean] = positive andThen odd // spaces between method calls
    println("2 is an even number: " + evenCheck(2))
    println("3 is an odd number: " + oddCheck(3))

    // Collect example:
    val list: List[Double] = List(1.0, 4: Int, 9.0, 16.0, 25.0, -10, -9, -4)
    val squared = list.collect(squareRoot)
    // val squaredDeep = list.collect(squareRootDeep)
    println("squared list: " + squared)

    println()
  }

  def squareRoot: PartialFunction[Double, Double] = {
    case toBeSquared if toBeSquared > 0 => Math.sqrt(toBeSquared)
  }

  def squareRootDeep: PartialFunction[Double, Double] = {
    case x if x > 0 => x match {
      case y if y == 2 => Math.sqrt(y)
    }
  }

  def positive: PartialFunction[Int, Int] = {
    case x if x >= 0 => x
  }

  def odd: PartialFunction[Int, Boolean] = {
    case x if x % 2 == 1 => true
  }

  def even: PartialFunction[Int, Boolean] = {
    case x if x % 2 == 0 => true
  }
}
