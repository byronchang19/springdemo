package com.zhangnaiwang.test;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-17 13:57
 */
public class HelloRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from a runnable");
    }
}
