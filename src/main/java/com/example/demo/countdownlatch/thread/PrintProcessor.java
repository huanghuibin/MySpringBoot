package com.example.demo.countdownlatch.thread;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/4/10
 * Time:14:23
 */
public class PrintProcessor extends Thread implements RequestProcessor  {

    private LinkedBlockingQueue<Request> linkedBlockingQueue = new LinkedBlockingQueue<>();

    private RequestProcessor nextProcessor;

    public PrintProcessor(RequestProcessor requestProcessor) {
        this.nextProcessor = requestProcessor;
    }

    @Override
    public void run() {
        while(true){
            try {
                Request take = linkedBlockingQueue.take();
                System.out.println("print data" +take.toString());
                nextProcessor.doProcessor(take);
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
