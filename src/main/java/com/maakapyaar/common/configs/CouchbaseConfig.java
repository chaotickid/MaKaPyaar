/**
 * Copyright (c) 2023. MaakaPyaar.
 */
package com.maakapyaar.common.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

/**
 * @author Samadhan Borase
 */

@Configuration
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {
    @Value("${spring.couchbase.username}")
    private String userName;
    @Value("${spring.couchbase.password}")
    private String password;
    @Value("${spring.couchbase.bucket-name}")
    private String bucketName;
    @Value("${spring.couchbase.connection-string}")
    private String connectionString;
    @Override
    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return bucketName;
    }
}




