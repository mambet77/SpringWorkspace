package ru.javabegin.training.spring.impls.robot;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hand hand;

	private Head head;

	private Leg leg;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	@Override
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}
	public Hand getHand() {
		return hand;
	}
	public Head getHead() {
		return head;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
		System.out.println("set hand");
	}

	public void setHead1(Head head) {
		this.head = head;
		System.out.println("set head");
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
		System.out.println("set leg");
	}
	
	public void init(){
		System.out.println("init");
		
	}

}
