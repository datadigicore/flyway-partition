# Flyway Partition Table [![Build Status](https://travis-ci.com/datadigicore/flyway-partition.svg?branch=main)](https://travis-ci.com/datadigicore/flyway-partition)
This project will maintain your partition easily

### Features
- Create a future partition
- Detach and drop the old partition

### Requirements

Please make sure that you have installed the following:

- Java 11
- PostgreSQL 11

### How to
1. Setup configuration config.yaml
   ```
   databaseName: flyway_partition
   databaseHost: localhost
   databasePort: 5432
   databaseUsername: datadigicore
   databasePassword: datadigicore
   
   partitionRange: yearly
   partitionTables: table_one,table_two
   partitionNumberToRetain: 1
   partitionNumberOfFuture: 1
   ```

2. Build project
   ```
   ./gradlew clean build
   ```
   
3. Run project (default will fetch from resources/config.yml, if the argument not set)
   ```
   java -jar build/libs/flyway-partition-0.1.0.jar "/path/to/your/config/file.yml"
   ```
   
4. Setup a cron job for scheduling the partition job