package no.knowit.chapter.jvm.pmatcher

object Wrapper {
  def main(args: Array[String]): Unit = {
    println()
    println("Wrapper example:\n=============")

    val wrapWithDiv = wrap("<div>", _: String, "</div>")
    val wrapWithBody = wrap("<body>", _: String, "</body>")

    println(wrapWithDiv("this is wrapped in a div"))
    println(wrapWithBody("this is wrapped in a body"))
  }

  def wrap(prefix: String, html: String, suffix: String): String = {
    prefix + html + suffix
  }
}
