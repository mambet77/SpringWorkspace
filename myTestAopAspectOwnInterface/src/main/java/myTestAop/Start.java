package myTestAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext= new ClassPathXmlApplicationContext("context.xml");
		TestService myservice=(TestService) appContext.getBean("testService");
		
		myservice.getInfo();
		myservice.getObject();

		myservice.testAnnotation();
		myservice.getText();
	}

}
