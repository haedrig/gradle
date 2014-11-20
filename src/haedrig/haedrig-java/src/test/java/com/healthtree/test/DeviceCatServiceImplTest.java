package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.DeviceCatService;

public class DeviceCatServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        DeviceCatService service = (DeviceCatService) context.getBean("deviceCatService");  
        System.out.println(service.findDeletedAll(1, 11));
    }
}
