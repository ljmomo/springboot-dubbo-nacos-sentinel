package com.lvzhu.user;

import org.apache.dubbo.config.ConsumerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class UserComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserComsumerApplication.class, args);
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        return consumerConfig;
    }
}
