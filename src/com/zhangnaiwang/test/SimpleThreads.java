package com.zhangnaiwang.test;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-17 14:41
 */
public class SimpleThreads {
    //显示当前执行线程的名称、信息
    static void threadMessage(String message){
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n",threadName,message);
    }
}
