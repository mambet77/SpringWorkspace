package ru.javabegin.training.spring.aop.objects;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	public void testAspekt() {

		System.out.println("ich MyService fürhe  Methode "+methodenName());

	}

	private String methodenName() {
		StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];

		String klassenName = stackTraceElement.getClassName();
		String methodenName = stackTraceElement.getMethodName();
		
		return methodenName;
	}
	public void testAspekt2() {

		System.out.println("ich MyService fürhe  Methode "+methodenName());
	}

	public Object retOb() {
		System.out.println("ich MyService fürhe  Methode "+methodenName());
		return this;

	}

	public void divide(double v, double b) throws Exception {

		System.out.println("ich MyService fürhe  Methode "+methodenName()+" aus die ein Fehler generiert");
		throw new NullPointerException("Herrrrr tebe");

	}

}
