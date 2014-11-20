package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.LLQuestionsService;


public class LLQuestionsServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        LLQuestionsService service = (LLQuestionsService) context.getBean("llquestionsService");  
        System.out.println(service.find(1l, 1212l, 1, 1));
    }
}
