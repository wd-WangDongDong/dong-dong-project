package com.itwd.learnproject.thread.createThreadPoolDemo;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: wangdong
 * @Date: 2021/4/15 20:38
 * @Version 1.0
 */
public class ThreadTest {
    static class TxTark implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行业务逻辑。。。。");
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5,
                10,
                60L,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(5));

        for (int i = 0; i < 15; i++) {
            executor.execute(new TxTark());
        }
        executor.shutdown();
    }
}
