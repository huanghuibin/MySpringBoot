package com.example.demo.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/3/18
 * Time:17:43
 */
public class Test {

    public static void main(String[] args) {
        int count=50;
        ExecutorService service = Executors.newFixedThreadPool(count);
        final CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {
                        latch.await();//当前线程调用此方法，则计数减一
//                        System.out.println("子线程" + Thread.currentThread().getName() + "开始执行" + System.currentTimeMillis());
                        System.out.println(Singleton3.getInstance());
                        Thread.sleep((long) (Math.random() * 10000));
//                        System.out.println("子线程"+Thread.currentThread().getName()+"执行完成");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            service.execute(runnable);
            latch.countDown();
        }

        try {
            System.out.println("主线程"+Thread.currentThread().getName()+"等待子线程执行完成...");
//            latch.await();//阻塞当前线程，直到计数器的值为0
            System.out.println("主线程"+Thread.currentThread().getName()+"开始执行...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
