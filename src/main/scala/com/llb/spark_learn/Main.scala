package com.llb.spark_learn

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object Main {
  
  def main(args: Array[String]): Unit = {
    val logFile = "D:/programFiles/spark-2.1.0-bin-hadoop2.7/README.md" // Should be some file on your system
    
    val sparkConf = new SparkConf().setAppName("simple").setMaster("local");
    val sparkContext = new SparkContext(sparkConf);
    var text = sparkContext.textFile(logFile, 3);
   val count =  text.count();
   val firstLine = text.first()
   Thread.sleep(1000)
    System.out.println(count)
     System.out.println(firstLine)
  }
}