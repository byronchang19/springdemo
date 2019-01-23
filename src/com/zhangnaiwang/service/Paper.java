package com.zhangnaiwang.service;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-09 9:50
 */
public interface Paper {
    String newLine = "\r\n";

    //输出一个字符到纸张
    public void putInChar(char c);

    //得到纸张上的内容
    public String getContent();
}
