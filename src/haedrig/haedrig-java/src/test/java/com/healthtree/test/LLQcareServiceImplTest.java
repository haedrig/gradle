package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.LLQcareService;


public class LLQcareServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        LLQcareService service = (LLQcareService) context.getBean("llqcareService");  
        System.out.println(service.find(10203l, 4l));
    }
}
