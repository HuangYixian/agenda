package com.yang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//用来定义你的注解将应用在什么地方,本处应用为方法
//用来定义该注解在哪一个级别可用,在源代码中(source)类文件中(class)或者运行时(runtime)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoCreate {
}
