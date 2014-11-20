package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.EmailSender;

public class EmailSenderImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        EmailSender service = (EmailSender) context.getBean("emailSender");  
        System.out.println(service);
    }
}
