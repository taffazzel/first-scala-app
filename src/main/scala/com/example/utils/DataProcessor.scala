package com.example.utils

import org.apache.spark.sql.SparkSession

// import DataFrame library
import org.apache.spark.sql.DataFrame

object DataProcessor {
  def processData(df: DataFrame): DataFrame = {
    println("Processing data...")
    val df2 = df.filter("GPA > 3.5")
    df2.show()
    df2
  }

}
