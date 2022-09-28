// Databricks notebook source
var listData = spark.sparkContext.parallelize(List("Hi everyone","Good evening","Welcome to Databricks CI/CD session"))
var df = listData.toDF
df.show()
