package com.microservices.demo.twitter.to.kafka.services.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-services")
public class TwitterToKafkaServiceConfigData {
    private List<String> twitterKeywords;
}
