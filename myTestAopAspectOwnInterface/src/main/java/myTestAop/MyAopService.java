package myTestAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAopService  {
	
	@Pointcut("execution(* myTestAop.TestService.*())")
	public void AllMethod()
	{
		
	}
	

	@Pointcut("execution(* myTestAop.myInterface.*(..))")
	public void AllMethodWithInterface()
	{
		
	}
	
	@After("AllMethodWithInterface()")
	public void methodInterface()
	{
		System.out.println("Interface klappt");
	}
	
	
	@Around("AllMethod()")
	
	public Object  myService(ProceedingJoinPoint joinpoiunt){
		
		System.out.println("ich bin service");
		Object obj=null;
		
		
		
		try {
			obj=joinpoiunt.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(obj.getClass());
		return obj;
	}
	
	
	@AfterReturning(pointcut="AllMethod()", returning="obj" )
	public void tesAfterRet(Object obj){
		
		System.out.println(obj.getClass().getSimpleName());
	}
	
	@After("AllMethod() && @annotation(IMyType)")
	public void testAnnotation()
	{
		System.out.println("das klappt");
	}

}
