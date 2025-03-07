package com.example.utils

object SessionCreate {
  import org.apache.spark.sql.SparkSession

  def createSession(appName: String): SparkSession = {
    SparkSession.builder()
      .appName(appName)
      .master("local[*]") // Run Spark locally
      .getOrCreate()
  }

}
