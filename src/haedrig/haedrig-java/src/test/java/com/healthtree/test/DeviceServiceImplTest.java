package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.DeviceService;

public class DeviceServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        DeviceService service = (DeviceService) context.getBean("deviceService");  
        System.out.println(service);
    }
}
