package com.example.demo.countdownlatch.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/4/11
 * Time:16:03
 */
public class Station extends Thread {

    public Station(String name) {
        super(name);
    }

    private static int ticket = 20;


    @Override
    public void run() {
        while(ticket > 0 ){
            synchronized (Station.class) {
                if (ticket > 0) {
                    System.out.println(getName() + "卖了第" + ticket + "张票");
                    ticket --;
                }else{
                    System.out.println("票卖完了");
                }
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
