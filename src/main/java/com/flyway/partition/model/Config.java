package com.flyway.partition.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Config {
    public int databasePort;
    public String databaseName;
    public String databaseHost;
    public String databaseUsername;
    public String databasePassword;

    public int partitionNumberToRetain;
    public int partitionNumberOfFuture;
    public String partitionRange;
    public String partitionTables;
}