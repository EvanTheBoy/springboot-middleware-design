package com.evan.middleware.whiltelist.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface DoWhiteList {
    /**
     * 配置当前接口入参需要提取的属性
     * @return
     */
    String key() default "";

    /**
     * 在拦截到用户请求后给一个返回信息
     * @return
     */
    String returnJson() default "";
}
