package main.scala.com.example

import org.apache.spark.sql.SparkSession
import com.example.utils.{DataProcessor, SessionCreate}

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, Scala with Maven!")
    val spark = SparkSession.builder()
      .appName("My First Spark App")
      .master("local[*]") // Run Spark locally
      .getOrCreate()

    import spark.implicits._
    val data = Seq(
      ("John", 22, "Math", 3.5),
      ("Smith", 23, "Math", 3.5),
      ("Sarah", 24, "Math", 3.5),
      ("Jane", 25, "Math", 3.7),
      ("Doe", 26, "Math", 3.8),
      ("Tom", 27, "Math", 3.9),
      ("Jerry", 28, "Math", 4.0),
      ("Alice", 29, "Math", 4.0),
      ("Bob", 30, "Math", 4.0),
      ("Charlie", 31, "Math", 4.0)
    )

    val someDF = data.toDF("Name", "Age", "Module", "GPA")
    val resultDF = DataProcessor.processData(someDF)
    resultDF.show()


  }

}
