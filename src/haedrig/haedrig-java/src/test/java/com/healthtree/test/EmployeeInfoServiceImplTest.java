package com.healthtree.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.healthtree.entity.EmployeeInfo;
import com.healthtree.service.EmployeeInfoService;

public class EmployeeInfoServiceImplTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring.xml");
		context.start();

		EmployeeInfoService service = (EmployeeInfoService) context
				.getBean("employeeInfoService");
		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.setId(2l);
		employeeInfo.setEmail("12131321322@163.com");
		service.edit(employeeInfo);
	}
}
