package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.micro")
public class catalogServiceApplication {
    @Bean
    public RestTemplate getResttemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(catalogServiceApplication.class, args);
    }
}
