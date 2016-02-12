package example

import org.denigma.threejs._
import org.scalajs.dom

import scala.scalajs.js

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong>It works!  For real! Again!</strong>"
    dom.document.getElementById("playground").appendChild(paragraph)

    val scene = new Scene

    val camera = new PerspectiveCamera(75, dom.window.innerWidth / dom.window.innerHeight, 0.1, 1000)

    val renderer = new WebGLRenderer()

    renderer.setSize(dom.window.innerWidth, dom.window.innerHeight)

    dom.document.body.appendChild(renderer.domElement)

    val geometry = new BoxGeometry(1, 1, 1)

    val material: MeshBasicMaterial = new MeshBasicMaterial()
//    var material = new THREE.MeshBasicMaterial( { color: 0x00ff00 } );

    val cube = new Mesh(geometry, material)

    scene.add(cube)

    camera.position.z = 5

    cube.rotateX(0.1)
    cube.rotateY(0.1)

    renderer.render(scene , camera)
//
//    var render = function () {
//      requestAnimationFrame( render );
//
//      cube.rotation.x += 0.1;
//      cube.rotation.y += 0.1;
//
//      renderer.render(scene, camera);
//    };
//
//    render();

  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
