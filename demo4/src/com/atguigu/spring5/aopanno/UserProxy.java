package com.atguigu.com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Jonathan
 * @description
 * @create 2021-02-27 20:20
 */

@Component
@Aspect //生成代理对象
public class UserProxy {

    // 前置通知，@Before注解表示作为前置通知
    @Before("execution(* com.atguigu.com.atguigu.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("before.....");
    }
}
