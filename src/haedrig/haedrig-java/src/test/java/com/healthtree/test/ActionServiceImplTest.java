package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.ActionService;


public class ActionServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        ActionService service = (ActionService) context.getBean("actionService");  
        System.out.println(service.findAll(1, 11));
    }
}
