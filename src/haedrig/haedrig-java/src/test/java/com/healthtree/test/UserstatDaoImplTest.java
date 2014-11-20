package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.UserStatService;

public class UserstatDaoImplTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		context.start();

		UserStatService service = (UserStatService) context
				.getBean("userStatService");
		System.out.println(service.findLevelThreeBpByGroupId(1l, "", 1, 11)
				.getResult());
	}
}
