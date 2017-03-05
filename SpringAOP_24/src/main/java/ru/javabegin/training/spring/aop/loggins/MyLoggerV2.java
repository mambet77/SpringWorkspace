package ru.javabegin.training.spring.aop.loggins;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyLoggerV2 {
	
	public void init()
	{
		System.out.println("Ich \"MyLoggerV2\" führe Methode init() aus ");
	}
	
	public void printo(Object objx)
	{
		System.out.println("Ich \"MyLoggerV2\" führe Methode printo() aus und drucke dem zurückgegebenen Object aus -"+objx);
	
	}
	
	public void exc(Exception ex)  
	{
		System.out.println("Ich \"MyLoggerV2\" habe gerade eine Fehler gefangen    ");		
		
	}
	
	public void aroundmy(ProceedingJoinPoint joinpoiunt){
		
		System.out.println("Ich \"MyLoggerV2\" führe mich aus befor der Mothode "+ joinpoiunt.getSignature().toShortString());
		
		try {
			joinpoiunt.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Ich \"MyLoggerV2\" führe mich aus after der Mothode "+ joinpoiunt.getSignature().toShortString());
		
		
		
	}

}
