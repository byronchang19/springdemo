package com.zhangnaiwang.test;

import static com.zhangnaiwang.test.SimpleThreads.threadMessage;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-17 14:45
 */
public class MessageLoop implements Runnable {

    public void setImportantInfo(String[] importantInfo) {
        this.importantInfo = importantInfo;
    }

    private String importantInfo[];


//    public MessageLoop(String importantInfo[]){
//        this.importantInfo = importantInfo;
//    }
    @Override
    public void run() {
//        String importantInfo[] = {
//                "Mares eat oats",
//                "Does eat oats",
//                "Little lambs eat ivy",
//                "A kid will eat ivy too"
//        };
        try {
        for (int i = 0; i < importantInfo.length; i++) {

                Thread.sleep(1000);
            threadMessage(importantInfo[i]);
        }} catch (InterruptedException e) {
            threadMessage("I wasn't done!");
        }
    }
}
