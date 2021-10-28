package com.itwd.learnproject.redis.redistemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangdong
 * @Date: 2021/4/18 16:12
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class redisTemplateTest1 {

    @Resource
    private RedisTemplate redisTemplate;


    public static void main(String[] args) {

    }

    @Test
    public void test1(){
        System.out.println("**************");
        System.out.println(redisTemplate.opsForValue().get("k1"));
//        BoundValueOperations str1 = redisTemplate.boundValueOps("str1");
//        str1.set("111heloao");


    }

    //******************************* 基本 ************************************//
    /**
     * 删除单个key
     * @param key
     */
    public void delete(String key){
        redisTemplate.delete(key);
    }

    /**
     * 删除多个key
     * @param keys
     */
    public void deleteKey(String ...keys){
        redisTemplate.delete(keys);
    }

    /**
     * 设置key失效时间
     * @param key
     * @param time
     */
    public void expire(String key,long time){
        redisTemplate.expire(key,time, TimeUnit.MINUTES);
    }

    /**
     * 获取key失效时间
     * @param key
     * @return
     */
    public long getExpire(String key){
        return redisTemplate.getExpire(key);
    }

    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }



    //******************************* String ************************************//
    public void redisString(){
        redisTemplate.boundValueOps("sss").set("str1");
        redisTemplate.boundValueOps("StringKey1").set("String",1,TimeUnit.MINUTES);
    }

}
