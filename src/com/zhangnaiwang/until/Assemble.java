package com.zhangnaiwang.until;


import com.zhangnaiwang.service.Printer;
import com.zhangnaiwang.service.impl.ColorInkImpl;
import com.zhangnaiwang.service.impl.GreyColorInkImpl;
import com.zhangnaiwang.service.impl.TextPaperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-09 14:32
 */
@Configuration
public class Assemble {

    @Bean
    public ColorInkImpl colorInk(){
        return new ColorInkImpl();
    }

    @Bean
    public GreyColorInkImpl greyColorInk(){
        return new GreyColorInkImpl();
    }

    @Bean
    public TextPaperImpl textPaper(){
       return new TextPaperImpl();
    }

    @Bean
    public Printer printer(){
        return new Printer(colorInk(),textPaper());
    }
}
