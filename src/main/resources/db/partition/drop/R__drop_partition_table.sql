DO $$ BEGIN
    IF EXISTS (
        SELECT child.relname AS table_name FROM pg_inherits
        JOIN pg_class parent ON pg_inherits.inhparent = parent.oid
        JOIN pg_class child ON pg_inherits.inhrelid = child.oid
        WHERE parent.relname='${tableName}' AND child.relname = '${partitionTableName}'
    ) THEN
        ALTER TABLE ${tableName} DETACH PARTITION ${partitionTableName};
        DROP TABLE ${partitionTableName};
    END IF;
END $$;