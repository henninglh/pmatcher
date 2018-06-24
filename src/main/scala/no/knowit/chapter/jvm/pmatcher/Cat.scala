package no.knowit.chapter.jvm.pmatcher

object Cat {
  def main(args: Array[String]): Unit = {
    val catAndInt = List(1, "cat")

    // Using collect
    val collectResult = catAndInt collect { case number: Int => number + 1 }
    println("collectResult: " + collectResult)

    // Using map
    // val mapResult = catAndInt map { case number: Int => number + 1 }
    // println("mapResult: " + mapResult)
  }
}
