/* SimpleApp.scala */
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import com.datastax.spark.connector._
import org.apache.spark.sql.cassandra.CassandraSQLContext

object SimpleApp {
  def main(args: Array[String]) {
  	val conf = new SparkConf(true).set("spark.cassandra.connection.host", "15.155.20.77")
    val sc = new SparkContext(conf)
	val rdd = sc.cassandraTable("test", "kv")    
	println(rdd.count)
	println(rdd.first)
	println(rdd.map(_.getInt("value")).sum)
	val cc = new CassandraSQLContext(sc)
	val primero = cc.sql("SELECT * from test.kv where key='key1'")
	println(primero.first)
  }
}