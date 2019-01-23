package com.zhangnaiwang.test;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-18 11:42
 */
public class HelloWorldBean {
    private String name;

    public HelloWorldBean(){
        System.out.println("无参构造");
    }

    public HelloWorldBean(String name){
        this.name=name;
    }
    public void sayHell(){
        String name  = this.name;
        System.out.println("helloWorld"+name);
    }

    public void sayHello2(String name){
        this.name=name;
        System.out.println("helloWorld"+name);
    }
}
