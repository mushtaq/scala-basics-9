import Dependencies._

organization := "com.thoughtworks"
scalaVersion := "2.12.1"
version      := "0.1.0-SNAPSHOT"
name := "scala-basics-9"

   
libraryDependencies += `play-json`
// libraryDependencies += reftree
libraryDependencies += scalatest % Test


transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)

resolvers ++= Seq(
  Resolver.bintrayRepo("stanch", "maven"),
  Resolver.bintrayRepo("drdozer", "maven")
)
