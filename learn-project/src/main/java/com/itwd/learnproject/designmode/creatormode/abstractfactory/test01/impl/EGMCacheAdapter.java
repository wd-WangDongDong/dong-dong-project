package com.itwd.learnproject.designmode.creatormode.abstractfactory.test01.impl;

import com.itwd.learnproject.designmode.creatormode.abstractfactory.test01.ICacheAdapter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangdong
 * @Date: 2021/3/11 17:03
 * @Version 1.0
 */
@Slf4j
public class EGMCacheAdapter implements ICacheAdapter {
    private Map<String,String> dataMap = new ConcurrentHashMap<>();

    @Override
    public String get(String key) {
        log.info("EGM获取数据 key:{}",key);
        return dataMap.get(key);
    }

    @Override
    public void set(String key, String value) {
        log.info("EGM写入数据 key：{} val：{}", key, value);
        dataMap.put(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeuint) {
        log.info("EGM写入数据 key：{} val：{} timeout：{} timeUnit：{}", key, value, timeout, timeuint.toString());
        dataMap.put(key,value);
    }

    @Override
    public void del(String key) {
        log.info("EGM删除数据 key：{}", key);
        dataMap.remove(key);
    }
}
