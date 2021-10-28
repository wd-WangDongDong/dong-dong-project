package com.itwd.learnproject.designmode.creatormode.singleton;

/**
 * @Author: wangdong
 * @Date: 2021/2/19 15:11
 * @Version 1.0
 */
public class SingletonTest05 {
    private SingletonTest05() {
    }

    private static volatile SingletonTest05 instance;

    public static synchronized SingletonTest05 getInstance(){
        if(instance == null){
            synchronized (SingletonTest05.class){
                if(instance == null){
                    instance = new SingletonTest05();
                }
            }
        }
        return instance;
    }
}
