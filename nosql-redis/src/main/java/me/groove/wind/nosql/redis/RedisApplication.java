package me.groove.wind.nosql.redis;

import me.groove.wind.nosql.redis.domain.Address;
import me.groove.wind.nosql.redis.service.RedisCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/4/20.
 */
@SpringBootApplication
public class RedisApplication implements CommandLineRunner {

    @Autowired
    RedisCacheService redisCacheService;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RedisApplication.class, args).close();
    }


    @Override
    public void run(String... strings) throws Exception {
        Address a1 = redisCacheService.findAddress(5L, "abc", "dee");
        System.out.println("build cache...");
        Address a2 = redisCacheService.findAddress(5L, "abc", "dee");
        System.out.println("use cache...");
    }
}
