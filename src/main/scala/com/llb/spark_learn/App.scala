//package com.llb.spark_learn
//import org.apache.spark.sql.SparkSession
//
///**
// * @author ${user.name}
// */
//object App {
//  
//  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
//  
//  def main(args : Array[String]) {
//    println( "Hello World!" )
//    println("concat arguments = " + foo(args))
//     val logFile = "D:/programFiles/spark-2.1.0-bin-hadoop2.7/README.md" // Should be some file on your system
//    val spark = SparkSession.builder.appName("Simple Application").master("local").getOrCreate()
//    val logData = spark.read.textFile(logFile).cache()
//    val numAs = logData.filter(line => line.contains("a")).count()
//    val numBs = logData.filter(line => line.contains("b")).count()
//    println(s"Lines with a: $numAs, Lines with b: $numBs")
//    spark.stop()
//  }
//
//}
