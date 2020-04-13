package com.example.demo.countdownlatch.thread;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/4/10
 * Time:14:29
 */
public class SaveProcessor extends Thread implements RequestProcessor {

    private LinkedBlockingQueue<Request> linkedBlockingQueue = new LinkedBlockingQueue<>();


    @Override
    public void run() {
        while (true) {
            try {
                Request take = linkedBlockingQueue.take();
                System.out.println("save Data :" + take.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void doProcessor(Request request) {
        linkedBlockingQueue.add(request);
    }
}
