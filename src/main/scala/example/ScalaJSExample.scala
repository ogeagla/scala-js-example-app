package example

import org.scalajs.dom

import scala.scalajs.js

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong>It works!  For real!</strong>"
    dom.document.getElementById("playground").appendChild(paragraph)


  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
