package com.zhangnaiwang.test;

import org.springframework.beans.factory.annotation.Value;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-15 11:25
 */
public class Hello {
    @Value("${name}")
    private String name;

//    public Hello(String name){
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say(){
        System.out.println("我的名字叫"+name);
    }
}
