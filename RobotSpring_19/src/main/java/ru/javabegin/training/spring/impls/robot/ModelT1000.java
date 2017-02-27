package ru.javabegin.training.spring.impls.robot;

import java.beans.ConstructorProperties;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.*;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private String color;
	@Autowired
	private Hand hand;
	@Autowired(required = false)
	@Qualifier("SonyHeadGold")
	private Head head;
	@Autowired
	@Qualifier("SonyLeg")
	private Leg leg;
	private boolean soundEnabled;
	private int year;
	private List<String> list;
	private Map<String, Integer> mapchen;
	private Collection<Robot> robotCollection;

	public ModelT1000() {
	}

	public ModelT1000(Collection<Robot> robotCollection) {
		this.robotCollection = robotCollection;
	}
	@Autowired
	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public ModelT1000(String color, Hand hand, Head head, Leg leg, boolean soundEnabled, int year) {
		super();
		this.color = color;
		this.hand = hand;
		this.head = head;
		this.leg = leg;
		this.soundEnabled = soundEnabled;
		this.year = year;
	}

	// @ConstructorProperties({ "color_V2", "year_V2", "soundEnabled_V2"})
	public ModelT1000(String color, int year, boolean soundEnabled) {
		super();
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	@Override
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
		System.out.println("sound enabled: " + soundEnabled);
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

	@Override
	public void sayInfo(String sy) {
		hand.catchSomething();
		leg.go();
		head.calc();
	}

	public String getColor() {
		return color;
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

	public int getYear() {
		return year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void setHeadd1(Head head) {
		this.head = head;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public void sayInfo() {
		System.out.println(this);
	}

	public Map<String, Integer> getMapchen() {
		return mapchen;
	}

	public void setMapchen(Map<String, Integer> mapchen) {
		this.mapchen = mapchen;
	}

	public void setRobotCollection(Collection<Robot> robotCollection) {
		this.robotCollection = robotCollection;
	}

	@Autowired
	public void preper(Leg leg, Head head) {
		this.head = head;
		this.leg = leg;
		System.out.println("Klapts");
	}
}
