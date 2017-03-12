package myTestAop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestService implements myInterface {

	public int getInfo()
	{
		System.out.println("ich bin mei getInfo");
		return 2;
	}
	
//	

	public int getObject(){
		
		System.out.println("ich bin mei getObject");
		
		return 3;

	}
	
	
	@IMyType(val = myEnum.VALAUE)
	public int testAnnotation(){
		
		System.out.println("TestAnnotation");
		
		return 11;

	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return "hallo";
	}
}
