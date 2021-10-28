package com.itwd.learnproject.designmode.creatormode.abstractfactory.test01;

import java.lang.reflect.Proxy;

/**
 * @Author: wangdong
 * @Date: 2021/3/11 17:28
 * @Version 1.0
 */
public class JDKProxy {
    public static <T> T getProxy(Class<T> interfaceClass,ICacheAdapter cacheAdapter) throws Exception {
        JDKInvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(cacheAdapter.getClass().getClassLoader(),new Class[]{classes[0]},handler);
    }
}
