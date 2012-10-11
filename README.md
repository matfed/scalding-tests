This project shows basic usage of Scalding's both API's. It also shows how to use Maven to build jar with dependencies that can be run on a cluster.

To package:
mvn package

To run:
hadoop jar scalding_tests-1.0-job.jar com.twitter.scalding.Tool scalding_tests.MyJob --local --input inFile --output outFile

or

hadoop jar scalding_tests-1.0-job.jar com.twitter.scalding.Tool scalding_tests.MyJobTyped --local --input inFile --output outFile

To use HDFS use --hdfs instead of --local
