package SparkEx

import java.lang.String
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCount extends App {

 val conf = new SparkConf().setAppName("WordCount").setMaster("local")
 val sc = new SparkContext(conf)

 //Read input file
 val input = sc.textFile("/Users/gopinath/Desktop/work/input/sample.txt")

 input.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey(_ + _)
 .saveAsTextFile("/Users/gopinath/Desktop/work/output1")

 sc.stop()
}