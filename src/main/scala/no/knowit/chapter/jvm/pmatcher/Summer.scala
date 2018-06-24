package no.knowit.chapter.jvm.pmatcher

/**
  * In functional programming languages, when you call a function that has parameters,
  * you are said to be applying the function to the parameters.
  * When all the parameters are passed to the function — something you always do in Java —
  * you have fully applied the function to all of the parameters. But when you give only
  * a subset of the parameters to the function,
  * the result of the expression is a partially applied function.
  * Source: https://alvinalexander.com/scala/how-to-use-partially-applied-functions-in-scala-syntax-examples
  */
object Summer {
  def main(args: Array[String]): Unit = {
    println()

    println("Summer example:\n=============")
    val addOneAndTwoToSomething: Int => Int = sum(1, _: Int, 2)
    println(addOneAndTwoToSomething(1))
    println(addOneAndTwoToSomething(2))
    println(addOneAndTwoToSomething(10))

    println()
  }

  def sum(a: Int, b: Int, c: Int): Int = {
    println("a: " + a)
    println("b: " + b)
    println("c: " + c)
    val result = a + b + c
    println("result: " + result)
    result
  }
}
