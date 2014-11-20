package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.service.GroupService;

public class GroupServiceImplTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		context.start();

		GroupService service = (GroupService) context.getBean("groupService");
		System.out.println(service.findTwoDayNoBp(1l));
	}
}
