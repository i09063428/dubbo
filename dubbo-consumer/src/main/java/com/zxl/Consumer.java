package com.zxl;

import com.zxl.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by ry on 2020/4/20.
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-consumer.xml"});
        context.start();
        IUserService userService = (IUserService) context.getBean(IUserService.class);
        System.out.println("获取服务端的反馈信息" + userService.helle());
        System.in.read();
    }
}
