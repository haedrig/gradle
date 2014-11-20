package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.BpressureService;

public class BpressureServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        BpressureService service = (BpressureService) context.getBean("bpressureService");  
        System.out.println(service.find(10969l, 1396436946583l, 1396436946583l));
    }
}
