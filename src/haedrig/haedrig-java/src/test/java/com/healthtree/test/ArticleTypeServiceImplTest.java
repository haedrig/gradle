package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.ArticleTypeService;



public class ArticleTypeServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        ArticleTypeService service = (ArticleTypeService) context.getBean("articleTypeService");  
        System.out.println(service);
    }
}
