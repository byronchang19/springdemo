package com.zhangnaiwang.service.impl;


import com.zhangnaiwang.service.Paper;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-09 11:32
 */
public class TextPaperImpl implements Paper {

    //每行字符数
    private int charNum = 16;

    //每页行数
    private int line = 5;

    //纸张中的内容
    private String content = "";

    //当前横向位置
    private int posX;

    //当前行数
    private int posY;

    //当前页数
    private int posP = 1;

    public int getCharNum() {
        return charNum;
    }

    public int getLine() {
        return line;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getPosP() {
        return posP;
    }

    public void setCharNum(int charNum) {
        this.charNum = charNum;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setPosP(int posP) {
        this.posP = posP;
    }

    @Override
    public void putInChar(char c) {
        content += c;
        ++posX;

        //换行
        if(posX==charNum){
            content += newLine;
            posX = 0;
            ++posY;
        }

        //换页
        if(posY == line){
            content += "第"+posP+"页";
            content +=newLine+newLine;
        }
    }

    @Override
    public String getContent() {

        String str = this.content;
        if(!(posX==0&&posY==0)){
            int count = line = posY;
            for (int i = 0; i < count; i++) {
                str+=newLine;
            }
            str+="第"+posP+"页";
        }
        return str;
    }
}
