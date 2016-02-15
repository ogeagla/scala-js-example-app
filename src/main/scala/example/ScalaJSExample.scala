package example

import phaser._

import scala.scalajs.js

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {

    //ThreeJs stuff
    ThreeStuff()


    //PhaserJs stuff:
    val game = new Game(width = 800, height = 520, parent = "ze-container")
    game.state.add("game", new GameState)
    game.state.start("game")
  }



  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
