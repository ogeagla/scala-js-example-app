// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

workbenchSettings

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

persistLauncher in Compile := true

persistLauncher in Test := false

skip in packageJSDependencies := false

testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies ++= Seq(
    "org.scala-js" %%% "scalajs-dom" % "0.8.2",
    "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
)

resolvers += sbt.Resolver.bintrayRepo("denigma", "denigma-releases") //add resolver
jsDependencies += "org.webjars" % "three.js" % "r74" / "three.js"
libraryDependencies += "org.denigma" %%% "threejs-facade" % "0.0.71-0.1.5" //add dependency

bootSnippet := "example.ScalaJSExample().main(document.getElementById('canvas'));"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)

scalaJSUseRhino in Global := false
