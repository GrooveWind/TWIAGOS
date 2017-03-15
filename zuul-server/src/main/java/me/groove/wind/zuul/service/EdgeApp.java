package me.groove.wind.zuul.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by GrooveWind on 2017/3/15.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class EdgeApp {

    public static void main(String[] args) {
        SpringApplication.run(EdgeApp.class, args);
    }

}
