package com.fun.framework.annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于App端登录后才能操作
 * 默认拦截配置：拦截 /app/** 的所有请求
 * 若需更改，参考 com.fun.framework.interceptor.InterceptorConfig.class
 * @author DJun
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface NeedLoginToken {
    boolean required() default true;
}
