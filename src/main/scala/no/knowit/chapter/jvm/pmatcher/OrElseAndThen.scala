package no.knowit.chapter.jvm.pmatcher

object OrElseAndThen {
  def main(args: Array[String]): Unit = {
    // converts 1 to "one", etc., up to 5
    val convert1to5 = new PartialFunction[Int, String] {
      val nums = Array("one", "two", "three", "four", "five")
      def apply(i: Int) = nums(i-1)
      def isDefinedAt(i: Int) = i > 0 && i < 6
    }

    // converts 6 to "six", etc., up to 10
    val convert6to10 = new PartialFunction[Int, String] {
      val nums = Array("six", "seven", "eight", "nine", "ten")
      def apply(i: Int) = nums(i-6)
      def isDefinedAt(i: Int) = i > 5 && i < 11
    }

    val handle1To10 = convert1to5 orElse convert6to10

    println("handle 3: " + handle1To10(3))
    println("handle 7: " + handle1To10(7))
  }
}
