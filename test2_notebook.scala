// Databricks notebook source
var listData = spark.sparkContext.parallelize(List("Hi everyone","this is the notebook in feature branch"))
var df = listData.toDF
df.show()
