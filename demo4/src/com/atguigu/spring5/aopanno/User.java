package com.atguigu.com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author Jonathan
 * @description
 * @create 2021-02-27 19:25
 */
@Component
public class User {

    public void add() {
        System.out.println("add....");
    }
}
