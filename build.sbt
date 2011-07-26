organization := "eu.getintheloop.sample"

name := "soap-example"

version := "0.1"

scalaVersion := "2.8.1"

scalacOptions += "-deprecation"

libraryDependencies += "net.databinder" %% "dispatch-http" % "0.8.5" % "compile"

mainClass in (Compile, run) := Some("eu.getintheloop.sample.Main")
