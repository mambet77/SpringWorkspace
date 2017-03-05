package ru.javabegin.training.spring.aop.loggins;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggerV2 {
	
	@Pointcut("execution(* ru.javabegin.training.spring.aop.objects.MyService.*(..))")
	public void allMethods()
	{
		
	}
	
	@Pointcut("execution(* ru.javabegin.training.spring.aop.objects.MyService.*(..))&& @annotation(ShowResult)")
	public void allAround()
	{
		
	}
	@Before("allMethods()")
	public void init()
	{
		System.out.println("Ich \"MyLoggerV2\" führe Methode init() aus ");
	}
	
	@AfterReturning(pointcut="allMethods()", returning="objx" )
	public void printo(Object objx)
	{
		System.out.println("Ich \"MyLoggerV2\" führe Methode printo() aus und drucke dem zurückgegebenen Object aus -"+objx);
	
	}
	
	@AfterThrowing(pointcut="allMethods()", throwing="ex")
	public void exc(Exception ex)  
	{
		System.out.println("Ich \"MyLoggerV2\" habe gerade eine Fehler gefangen    ");		
		
	}
	
	@Around("allAround() ")
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
