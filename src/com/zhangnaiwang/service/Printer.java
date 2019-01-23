package com.zhangnaiwang.service;


import com.zhangnaiwang.service.impl.ColorInkImpl;
import com.zhangnaiwang.service.impl.TextPaperImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-09 10:11
 */
public class Printer {
    //面向接口编程
    private Ink ink;
    private Paper paper;

//    private static final Logger LOGGER = LoggerFactory.getLogger(Printer.class);
//    private static final Logger LOGGER = LoggerFactory.getLogger(Printer.class);

//    private static final Logger LOGGER = LoggerFactory.getLogger(Printer.class);
    public Printer(ColorInkImpl colorInk, TextPaperImpl textPaper) {
        this.ink = colorInk;
        this.paper = textPaper;
    }

    public Ink getInk() {
        return ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    //打印的方法
    public void print(String str){
//        LOGGER.info("使用"+ink.getColor(255,200,0)+"的颜色打印：\n");

        //将字符串逐个字符输出到纸张
        for (int i = 0; i < str.length(); i++) {
            paper.putInChar(str.charAt(i));
        }

        //得到纸张上的内容

//        LOGGER.info(paper.getContent());
        System.out.print(paper.getContent());
        System.out.println("地方GV偶是佛山的皮肤不是低配放牛班");
    }
}
