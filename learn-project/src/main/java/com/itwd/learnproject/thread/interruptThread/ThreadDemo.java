package com.itwd.learnproject.thread.interruptThread;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Author: wangdong
 * @Date: 2021/4/21 18:24
 * @Version 1.0
 */
@Slf4j
public class ThreadDemo implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.MINUTES.sleep(1);
            log.info("线程" + Thread.currentThread().getName() + "睡眠完成，id：" + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
