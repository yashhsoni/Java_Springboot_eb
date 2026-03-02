package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Rolls Royce");
        return veh;
    }

    @Bean
    String Hello(){
        return "Hello!!";
    }

    @Bean
    Integer LuckyNumber(){
        return 10;
    }
}

