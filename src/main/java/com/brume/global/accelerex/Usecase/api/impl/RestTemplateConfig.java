package com.brume.global.accelerex.Usecase.api.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean("template")
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
