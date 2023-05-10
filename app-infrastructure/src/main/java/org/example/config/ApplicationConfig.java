/**
 * Copyright 2023 (C) VinBrain
 */

package org.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Huynh Quoc Dung
 */
@Configuration
@EnableConfigurationProperties
public class ApplicationConfig {

    @Value("${spring.config.activate.on-profile}")
    private String profile;

}
