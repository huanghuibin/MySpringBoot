package com.example.demo.countdownlatch.thread;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/4/11
 * Time:16:07
 */
public class StationTest {

    public static void main(String[] args) {
//        Station s1 = new Station("窗口1");
//        Station s2 = new Station("窗口2");
//        Station s3 = new Station("窗口3");
//        s1.start();
//        s2.start();
//        s3.start();
        for (int i = 0; i <  100; i++) {
            Station s1 = new Station("窗口" + i);
            s1.start();
        }
    }
}
