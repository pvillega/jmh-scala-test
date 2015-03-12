name := """jmh-scala"""

version := "1.0"

scalaVersion := "2.11.5"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.openjdk.jmh" % "jmh-core" % "1.6",
  "org.openjdk.jmh" % "jmh-generator-annprocess" % "1.6"
)

jmhSettings

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"

