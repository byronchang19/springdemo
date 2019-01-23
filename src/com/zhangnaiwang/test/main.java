package com.zhangnaiwang.test;

import com.zhangnaiwang.service.Printer;
import com.zhangnaiwang.service.Task;
import com.zhangnaiwang.service.impl.ColorInkImpl;
import com.zhangnaiwang.service.impl.TextPaperImpl;
import com.zhangnaiwang.until.Assemble;
import com.zhangnaiwang.until.Configure;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.util.Properties;

import static com.zhangnaiwang.test.SimpleThreads.threadMessage;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-14 17:32
 */
public class main {

    public static void main(String[] args) throws IOException, InterruptedException {

//        threadMessage("Starting MessageLoop thread");
////        (new MessageLoop()).run();
//
//                String importantInfo[] = {
//                "Mares eat oats",
//                "Does eat oats",
//                "Little lambs eat ivy",
//                "A kid will eat ivy too"
//        };
//        MessageLoop a = new MessageLoop();
//        a.setImportantInfo(importantInfo);
//        new Thread(a).start();
//        new Thread(a).start();
//        Quest1 quest1 = new Quest1();
//        BraveKnight braveKnight = new BraveKnight(quest1);
//        braveKnight.embarkOnQuest();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight braveKnight = (Knight) context.getBean("knight");
        braveKnight.embarkOnQuest();


    }
}
