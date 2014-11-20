package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.TitleService;


public class TitleServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        TitleService service = (TitleService) context.getBean("titleService");  
        System.out.println(service);
    }
}
