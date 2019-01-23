package com.zhangnaiwang.service.impl;

import com.zhangnaiwang.service.Task;
import com.zhangnaiwang.until.AttributeAnnotation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-16 14:53
 */
@Component
@AttributeAnnotation("Task1")
public class Task1 implements Task {

    @Value("songjian")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void task() {

        System.out.println("this is Task1");
    }
}
