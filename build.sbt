name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % Test,
  "org.sorm-framework" % "sorm" % "0.3.18",
  "mysql" % "mysql-connector-java" % "5.1.36"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

dependencyOverrides += "org.scala-lang" % "scala-compiler" % scalaVersion.value


fork in run := true

fork in run := true

fork in run := true

fork in run := true