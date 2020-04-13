package com.example.demo.countdownlatch.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/4/10
 * Time:14:02
 */
public class CallableDemo implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "laji";
    }

    public static void main(String[] args)  throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        CallableDemo callableDemo = new CallableDemo();
        Future<String> future = executorService.submit(callableDemo);
        System.out.println(future.get().toString());
        executorService.shutdown();
    }
}
