package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javabegin.training.spring.impls.robot.ModelT1000q;
import ru.javabegin.training.spring.interfaces.Robot;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		ModelT1000q t1000 = (ModelT1000q) context.getBean("modelT1000q");
		t1000.sayInfo();
		ModelT1000q robot20 =(ModelT1000q) context.getBean("robot");
		robot20.action();
		
	}
}
