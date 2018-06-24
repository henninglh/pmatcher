package no.knowit.chapter.jvm.pmatcher

object Discount {
  def main(args: Array[String]): Unit = {
    val discount30Applied = calculateProductPrice(30, _: Double)
    val discount70Applied = calculateProductPrice(70, _: Double)
    println("discount(30) applied: " + discount30Applied(100.0))
    println("discount(70) applied: " + discount70Applied(100.0))

    val productPrice10Applied = calculateProductPrice(_: Double, 10)
    println("productPrice(50) applied: " + productPrice10Applied(50))

    val noneApplied = calculateProductPrice(_: Double, _: Double)
    println("noneApplied(50, 50) applied: " + noneApplied(50, 50))
  }

  def calculateProductPrice(discount: Double, productPrice: Double): Double = {
    (1 - discount/100) * productPrice
  }
}
