package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.SmsSender;


public class SmsSenderImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        SmsSender service = (SmsSender) context.getBean("smsSender");  
        System.out.println(service);
    }
}
