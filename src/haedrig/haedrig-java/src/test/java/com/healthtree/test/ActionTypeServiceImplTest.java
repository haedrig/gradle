package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.ActionTypeService;


public class ActionTypeServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        ActionTypeService service = (ActionTypeService) context.getBean("actionTypeService");
        System.out.println(service);
    }
}
