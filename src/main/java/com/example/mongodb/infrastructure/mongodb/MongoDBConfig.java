package com.example.mongodb.infrastructure.mongodb;

import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

@Configuration
public class MongoDBConfig {

  @Bean
  public MongoCustomConversions customConversions() {
    return new MongoCustomConversions(Arrays.asList(new OffsetDateTimeReadConverter(), new OffsetDateTimeWriteConverter()));
  }
}
