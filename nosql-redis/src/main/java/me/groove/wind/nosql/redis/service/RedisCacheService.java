package me.groove.wind.nosql.redis.service;

import me.groove.wind.nosql.redis.domain.Address;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/20.
 */
@Service
public class RedisCacheService {

    @Cacheable(value = "addressCache",keyGenerator = "myKeyGenerator")
    public Address findAddress(Long id, String province, String city){
        System.out.println("缓存未构建");
        return new Address(id,province,city);
    }

}
