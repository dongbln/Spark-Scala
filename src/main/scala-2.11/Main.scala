/**
  * Created by TS on 05.03.16.
  */

import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext

case class Author (name:String,nrBooks:Int)

object Main {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext("local", "My App")
    val sqlContext = new SQLContext(sc);

    val rdd = sc.parallelize(List(Author("Matin", 22), Author("Peter", 44)))

    import sqlContext.implicits._
    val df = rdd.toDF("name", "count")
    df.printSchema();
    df.show();
  }
}
