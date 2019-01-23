package com.zhangnaiwang.service.impl;



import com.zhangnaiwang.service.Ink;

import java.awt.*;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-09 11:05
 */
public class ColorInkImpl implements Ink {
    @Override
    public String getColor(int r, int g, int b) {
        Color color  = new Color(r, g, b);

        return "#"+Integer.toHexString(color.getRGB()).substring(2);
    }
}
