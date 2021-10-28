package com.itwd.learnproject.designmode.creatormode.abstractfactory.test01;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wangdong
 * @Date: 2021/3/11 17:47
 * @Version 1.0
 */
public interface CacheService {
    String get(final String key);
    void set(String key,String value);
    void set(String key, String value, long timeout, TimeUnit timeUnit);
    void del(String key);
}
