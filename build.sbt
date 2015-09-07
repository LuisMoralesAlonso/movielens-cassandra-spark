name := "Movielens Project"

version := "1.0"

scalaVersion := "2.10.5"


libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.1"
libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.3.1"
libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "1.3.0"
libraryDependencies += "org.apache.cassandra" % "cassandra-thrift" % "2.1.9"
libraryDependencies += "org.apache.cassandra" % "cassandra-clientutil" % "2.1.9"
libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "2.1.7.1"
