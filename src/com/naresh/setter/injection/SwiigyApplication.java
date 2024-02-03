package com.naresh.setter.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SwiigyApplication {

	public static void main(String[] args) {
		
		BeanFactory  conatiner = new FileSystemXmlApplicationContext("D:\\workspaces\\Spring8PM_Oct09_Batch\\spring-core-example\\srping-beans-two.xml",
				"D:\\workspaces\\Spring8PM_Oct09_Batch\\spring-core-example\\srping-beans.xml");

		 Order order = (Order)conatiner.getBean("order1");
		 System.out.println(order.getAmount());
		 System.out.println(order.getOrderId());
		 System.out.println(order.getItems());
		 System.out.println(order.getItems().size());
		 
		 //get Prices 
		 System.out.println(order.getPrices());
		 
		 //Map data 
		 System.out.println(order.getItemPrices()); 
		

	}

}
