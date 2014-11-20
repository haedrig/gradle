package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.ArticleDisplayService;


public class ArticleDisplayServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        ArticleDisplayService service = (ArticleDisplayService) context.getBean("articleDisplayService");  
        System.out.println(service);
    }
}
