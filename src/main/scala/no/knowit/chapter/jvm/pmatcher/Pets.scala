package no.knowit.chapter.jvm.pmatcher

object Pets {
  def main(args: Array[String]): Unit = {
    // petsIndexTest()
    petsIsDefinedAtTest()
    petsSequenceWithCollectTest()
    petsLiftTest()
    lovePetsLiftTest()
  }

  def petsIndexTest(): Unit = {
    println("petsIndexTest")
    val pets = List("cat", "dog", "parrot")

    // Indexes
    println("pets(0) " + pets(0))
    println("pets(3) " + pets(3))
    println()
  }

  def petsIsDefinedAtTest(): Unit = {
    println("petsIsDefinedAt")
    val pets = List("cat", "dog", "parrot")

    // isDefinedAt
    println("pets.isDefinedAt(0)" + pets.isDefinedAt(0))
    println("pets.isDefinedAt(3)" + pets.isDefinedAt(3))
    println()
  }

  def petsSequenceWithCollectTest(): Unit = {
    println("petsSequenceWithCollectTest")
    val pets = List("cat", "dog", "parrot")

    val somePets = Seq(1, 2, 10) collect pets
    println("cat and dog, but what about parrot? " + somePets)
    println()
  }

  def petsLiftTest(): Unit = {
    println("petsLiftTest")
    val pets = List("cat", "dog", "parrot")

    println("Lift the cat?: " + pets.lift(0))
    println("Lift the elephant?: " + pets.lift(42))
    println()
  }

  def lovePetsLiftTest(): Unit = {
    println("lovePetsLiftTest")
    val pets = List("cat", "dog", "parrot")

    val loveCat = pets.lift(0).map("I love my " + _).getOrElse("")
    val loveNothing = pets.lift(42).map("I love my " + _).getOrElse("")

    println(loveCat)
    println("Nothing comes after this: " + loveNothing)
    println()
  }
}
