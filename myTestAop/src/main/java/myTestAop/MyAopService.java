package myTestAop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyAopService  {
	
	
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
	
	public void tesAfterRet(Object obj){
		
		System.out.println(obj.getClass().getSimpleName());
	}

}
