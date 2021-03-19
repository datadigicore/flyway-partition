CREATE TABLE IF NOT EXISTS ${partitionTableName} PARTITION OF ${tableName}
    FOR VALUES FROM ('${partitionRangeStart}') TO ('${partitionRangeFinish}');
