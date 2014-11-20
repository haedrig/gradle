package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.MyLoveService;


public class MyLoveServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        MyLoveService service = (MyLoveService) context.getBean("myLoveService");  
        System.out.println(service.findLoveMe(1l));
    }
}
