package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {


		// Creation of Container
		// XML config : Provide xml file location
		BeanFactory container = new FileSystemXmlApplicationContext(
				"D:\\workspaces\\Spring8PM_Oct09_Batch\\spring-core-example\\srping-beans.xml");
		// get employye object from container
		
		Student student = (Student)container.getBean("student1");
		
		System.out.println(student.getAvgOfMarks());
		System.out.println(student.getGender());
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getIsSelected());
		
	}

}
