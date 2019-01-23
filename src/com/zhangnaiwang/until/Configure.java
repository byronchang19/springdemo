package com.zhangnaiwang.until;

import com.zhangnaiwang.test.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-15 13:42
 */
@Configuration
public class Configure {
//    public Configure(){}
    @Bean
    public Hello hello(){
        Hello hello = new Hello();
//        hello.setName("zhang");
//        hello.say();
        return hello;
    }
}
