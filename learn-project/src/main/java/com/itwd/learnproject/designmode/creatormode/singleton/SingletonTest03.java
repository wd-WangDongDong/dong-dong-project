package com.itwd.learnproject.designmode.creatormode.singleton;

/**
 * @Author: wangdong
 * @Date: 2021/2/19 15:11
 * @Version 1.0
 */
public class SingletonTest03 {
    private SingletonTest03() {
    }

    private static SingletonTest03 instance;
    // 用到该方法时 才去创建
    public synchronized static SingletonTest03 getInstance(){
        if(instance == null){
            instance = new SingletonTest03();
        }
        return instance;
    }
}
