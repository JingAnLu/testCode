package com.atguigu.com.atguigu.spring5;

/**
 * @author Jonathan
 * @description
 * @create 2021-02-27 16:30
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add 方法执行了");
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
