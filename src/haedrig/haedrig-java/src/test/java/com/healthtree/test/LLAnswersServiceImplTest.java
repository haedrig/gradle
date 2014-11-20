package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.LLAnswersService;


public class LLAnswersServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        LLAnswersService service = (LLAnswersService) context.getBean("llanswersService");  
        System.out.println(service);
    }
}
