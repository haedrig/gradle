package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.ComboService;


public class ComboServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        ComboService service = (ComboService) context.getBean("comboService");  
        System.out.println(service);
    }
}
