package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confeguration {


    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {};
    }
}

//Json Request
//{
//        "client_first_name":"marri",
//        "client_last_name":"zakariae",
//        "address":"rabat",
//        "telephone":"0643454010",
//        "email":"marri@gmail.com",
//        "passager_first_name":"marri",
//        "passager_last_name":"zakariae",
//        "start_vole":"2023-01-02",
//        "end_vole":"2023-01-03"
//        }



