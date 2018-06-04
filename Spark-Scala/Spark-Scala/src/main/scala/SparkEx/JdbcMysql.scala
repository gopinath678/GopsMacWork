package SparkEx
import org.apache.spark.{SparkConf,SparkContext}
import org.apache.spark.sql.SQLContext
object JdbcMysql extends App{
   val conf = new SparkConf().setAppName("jdbc_Mysql").setMaster("local")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    val df = sqlContext.read.format("jdbc").option("url", "jdbc:mysql://localhost/retail_db").
    option("driver", "com.mysql.jdbc.Driver").
    option("dbtable", "categories").
    option("user", "root").
    option("password", "password").load()
  df.show()
}