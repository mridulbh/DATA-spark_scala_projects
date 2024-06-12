package de.scala.project

import org.apache.spark.sql.{DataFrame, SparkSession}

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("spark-scala-project")
      .master("local[*]")
      .getOrCreate()

    val  df: DataFrame = spark.read
      .option("header", value =true)
      .option("inferSchema",value =true)
      .csv("data/ABT.csv")

    df.show()

    df.printSchema()

    df.select("Date","Open","Close").show()
  }
}