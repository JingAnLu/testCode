package com.atguigu.com.atguigu.spring5;

/**
 * @author Jonathan
 * @description
 * @create 2021-04-22 18:36
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;

    //创建属性对应的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo() {
        System.out.println(bname + "::" + bauthor);
    }
}
