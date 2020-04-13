package com.example.demo.countdownlatch.thread;

/**
 * Created with IDEA
 * author:Huanghuibin
 * Date:2020/4/10
 * Time:14:32
 */
public class ProcessorDemo {
    PrintProcessor printProcessor;
    public ProcessorDemo() {
        SaveProcessor saveProcessor = new SaveProcessor();
        saveProcessor.start();
        printProcessor = new PrintProcessor(saveProcessor);
        printProcessor.start();

    }

    public static void main(String[] args) {
        ProcessorDemo processorDemo = new ProcessorDemo();
        for (int i = 0; i <20 ; i++) {
            Request request = new Request();
            request.setName("laji " + i );
            processorDemo.doTest(request);
        }
    }

    private void doTest(Request request){
        printProcessor.doProcessor(request);
    }

}
