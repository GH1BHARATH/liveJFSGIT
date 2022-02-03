package com.ezshop.ui;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ezshop.model.ProductIOC;

public class IOCSuperSimpleApp {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	ProductIOC productIOC = context.getBean("productIOC", ProductIOC.class);
	System.out.println(productIOC);
}
}
