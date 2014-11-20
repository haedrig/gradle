package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.UserInfoService;



public class UserInfoServiceImplTest {
	@SuppressWarnings("resource")
	public  static void main(String[] args){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();
        
        UserInfoService service = (UserInfoService) context.getBean("userInfoService");  
        System.out.println(service.findUserValidity(1l, "gwzhdm1zhfma85dn0gw0cc7mee94du65"));
    }
}
