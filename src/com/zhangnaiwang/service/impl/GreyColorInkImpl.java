package com.zhangnaiwang.service.impl;



import com.zhangnaiwang.service.Ink;

import java.awt.*;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-09 14:26
 */
public class GreyColorInkImpl implements Ink {
    @Override
    public String getColor(int r, int g, int b) {
        int c= (r+g+b)/3;
        Color color = new Color(c,c,c);
        System.out.println(Integer.toHexString(color.getRGB()));
        return "#"+Integer.toHexString(color.getRGB()).substring(2);
    }
}
