package com.flyway.partition.validator;

import com.flyway.partition.model.Config;
import net.logstash.logback.encoder.org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigValidator {

    private static final Logger logger = LoggerFactory.getLogger(ConfigValidator.class);

    private ConfigValidator() {
    }

    public static boolean validate(Config config) {
        if (StringUtils.isEmpty(config.databaseName)) {
            logger.error("databaseName can not be blank");
            return false;
        }
        if (StringUtils.isEmpty(config.databaseHost)) {
            logger.error("databaseHost can not be blank");
            return false;
        }
        if (StringUtils.isEmpty(config.databaseUsername)) {
            logger.error("databaseUsername can not be blank");
            return false;
        }
        if (StringUtils.isEmpty(config.databasePassword)) {
            logger.error("databasePassword can not be blank");
            return false;
        }
        if (StringUtils.isEmpty(config.partitionRange)) {
            logger.error("partitionRange can not be blank");
            return false;
        }
        if (StringUtils.isEmpty(config.partitionTables)) {
            logger.error("partitionTables can not be blank");
            return false;
        }
        return true;
    }
}