package com.itwd.learnproject.designmode.creatormode.singleton;

/**
 * @Author: wangdong
 * @Date: 2021/2/19 15:11
 * @Version 1.0
 */
public class SingletonTest06 {
    private SingletonTest06() {
    }

    private static class SingletonInstance{
        private static final SingletonTest06 INSTANCE = new SingletonTest06();
    }

    public static synchronized SingletonTest06 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
