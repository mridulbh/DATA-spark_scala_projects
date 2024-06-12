ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "spark-scala-project",
    idePackagePrefix := Some("de.scala.project")
  )
//Importing from maven repository
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql

val sparkVersion = "3.5.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)

