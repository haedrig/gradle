package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.ArticlePlateService;


public class ArticlePlateServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        ArticlePlateService service = (ArticlePlateService) context.getBean("articlePlateService");  
        System.out.println(service);
    }
}
