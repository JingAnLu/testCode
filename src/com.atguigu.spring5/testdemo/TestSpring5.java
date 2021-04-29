package com.atguigu.com.atguigu.spring5.testdemo;


import com.atguigu.com.atguigu.spring5.Book;
import com.atguigu.com.atguigu.spring5.User;
import com.atguigu.com.atguigu.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jonathan
 * @description
 * @create 2021-02-26 11:35
 */
public class TestSpring5 {

    @Test
    public void add() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        // 2.获取配置创建对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        MyBean myBean = applicationContext.getBean("myBean", MyBean.class);
        System.out.println(myBean);
    }


}