package myTestAop;

import org.springframework.stereotype.Component;

@Component
public class TestService {

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
}
