package com.frame.redis;

import com.frame.FrameApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

/**
 * @description:
 * @author: zxl
 * @create: 2020-11-16 09:05
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FrameApplication.class)
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void redis(){
        Set<String> range = stringRedisTemplate.opsForZSet().range("zxlTest", 0, -1);
        range.forEach(f->System.out.println(f));
        System.out.println("redis--------------test");
    }
}
