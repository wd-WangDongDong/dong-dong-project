package com.itwd.learnproject.designmode.creatormode.abstractfactory.test01.impl;

import com.itwd.learnproject.designmode.creatormode.abstractfactory.test01.CacheService;
import com.itwd.learnproject.designmode.creatormode.abstractfactory.test01.util.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wangdong
 * @Date: 2021/3/12 8:58
 * @Version 1.0
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key,value,timeout,timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
