package com.zhangnaiwang.until;

import java.lang.annotation.*;

/**
 * @version V 1.0
 * @Package:
 * @ClassName:
 * @Description:
 * @author:
 * @time 2019-01-16 14:52
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface AttributeAnnotation {
    String value() default "";
}
