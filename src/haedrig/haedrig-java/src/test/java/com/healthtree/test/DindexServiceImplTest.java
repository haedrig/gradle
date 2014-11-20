package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.DindexService;



public class DindexServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        DindexService service = (DindexService) context.getBean("dindexService");  
        System.out.println(service);
    }
}
