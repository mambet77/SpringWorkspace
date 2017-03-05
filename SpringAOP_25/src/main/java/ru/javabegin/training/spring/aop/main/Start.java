package ru.javabegin.training.spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.aop.objects.MyService;
import ru.javabegin.training.spring.aop.objects.SomeService;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		
		MyService myService = (MyService) context.getBean("myService");
		try {
			myService.divide(0, 0);
		} catch (Exception e) {
			System.out.println("ich main method habe gerade eine FEHLER gefangen");
		}
		myService.testAspekt2();
		myService.testAspekt();
		myService.retOb();

	}
}
