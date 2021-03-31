package com.thieleheemann.cloud.tema07.githubtwitter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class GithubTwitterConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
