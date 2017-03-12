package ru.javabegin.training.spring.impls.toshiba;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import ru.javabegin.training.spring.interfaces.Hand;

@Component
public class ToshibaHand implements Hand{
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}
	
	@Bean
	@Qualifier("ToshibaHand")
	public ToshibaHand getHand(){
		return new ToshibaHand();
	}

}
