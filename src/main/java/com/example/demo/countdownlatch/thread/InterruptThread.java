package com.example.demo.countdownlatch.thread;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/4/9
 * Time:19:46
 */
public class InterruptThread extends Thread {

      boolean stop = false;
    public void setStop(boolean  stop) {

        this.stop=stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println(getName() + "is running");

            try {
                sleep(1000);
            }catch (InterruptedException e){
                System.out.println(" week up from block");
//                stop = true;
            }
        }
        System.out.println(getName() + " is exiting");
    }
}
