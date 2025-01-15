package com.atguigu11.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * ClassName: MyAnnotation
 * Package: com.atguigu11.annotation
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/14 20:53
 * @Version 1.0
 */
@Target({TYPE, FIELD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
    String value() default "hello";
}
