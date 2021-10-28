package com.itwd.learnproject.thread.createThreadPoolDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: wangdong
 * @Date: 2021/4/15 22:48
 * @Version 1.0
 */
public class ThreadCallableTest {

    private static class ThreadDemo implements Runnable {

//        @Override
//        public Object call() throws Exception {
//            System.out.println(Thread.currentThread().getName() + "业务执行中");
//            return Thread.currentThread().getName();
//        }

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "业务执行中");
        }
    }

    private static class ThreadDemo1 implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(2000);
            return Thread.currentThread().getName() + "线程执行完毕";
        }
    }



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 20, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque<>(100));
        List<Future<String>> futureList = new ArrayList<Future<String>>();
        List<Callable<String>> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            arrayList.add(new ThreadDemo1());
//
//            System.out.println(">>>" + submit.get().toString());
//            futureList.add(submit);
        }
        List<Future<String>> futureList1 = executor.invokeAll(arrayList);
        for (Future future : futureList1){
            System.out.println(">>>" + future.get().toString());
        }


        executor.shutdown();

    }
}
