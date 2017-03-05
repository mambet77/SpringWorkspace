package ru.javabegin.training.spring.aop.loggins;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {

	public void printValue(Object obj) {
		System.out.println(obj);
	}

	public void init() {
		System.out.println("init");
	}

	public void close() {
		System.out.println("close");
	}

}
