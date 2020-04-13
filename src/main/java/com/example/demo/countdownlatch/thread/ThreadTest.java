package com.example.demo.countdownlatch.thread;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/4/9
 * Time:19:48
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
            final Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("s1");
                }
            });
        final Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    t1.join();
                }catch (Exception e){

                }
                System.out.println("s2");
            }
        });
        final Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    t1.join();
                }catch (Exception e){

                }
                System.out.println("s3");
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
