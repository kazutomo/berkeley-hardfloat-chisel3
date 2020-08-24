organization := "edu.berkeley.cs"

version := "1.2"

name := "hardfloat"

scalaVersion := "2.12.8"

scalacOptions += "-Xsource:2.11"

val defaultVersions = Map("chisel3" -> "3.3.2")

// Provide a managed dependency on chisel if -DchiselVersion="" issupplied on the command line.
libraryDependencies ++= (Seq("chisel3").map {
  dep: String => "edu.berkeley.cs" %% dep % sys.props.getOrElse(dep + "Version", defaultVersions(dep))
})


//libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.2-SNAPSHOT"

