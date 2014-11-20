package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.QrCodeService;



public class QrCodeServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        QrCodeService service = (QrCodeService) context.getBean("qrCodeService");  
        System.out.println(service);
    }
}
