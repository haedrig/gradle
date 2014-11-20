package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.DeviceTypeService;


public class DeviceTypeServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        DeviceTypeService service = (DeviceTypeService) context.getBean("deviceTypeService");  
        System.out.println(service);
    }
}
