package ru.javabegin.training.spring.impls.robot;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public abstract class BaseModel implements Robot  {

	private Hand hand;
	private Head head;
	private Leg leg;

	public BaseModel() {
		System.out.println(this + "   - BaseModel");
	}

	public BaseModel(Hand hand, Leg leg, Head head) {
		this();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
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
	}

	public void setHead1(Head head) {
		this.head = head;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}
}
