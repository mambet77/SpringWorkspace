package ru.javabegin.training.spring.impls.robot;

import java.util.List;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;


public class ModelT1000 extends BaseModel  {

	private String color;
	private List<String> list;
	private boolean soundEnabled;
	private int year;
	

	public ModelT1000() {
		super();
	}

	public ModelT1000( Hand hand, Head head, Leg leg, boolean soundEnabled,String color,  int year) {
		super(hand,leg,head);
		this.color = color;
		this.soundEnabled = soundEnabled;
		this.year = year;
	}

	public ModelT1000( boolean soundEnabled,String color,  int year) {
	
		this.color = color;
		this.soundEnabled = soundEnabled;
		this.year = year;
	}


	public String getColor() {
		return color;
	}

	public List<String> getList() {
		return list;
	}

	public int getYear() {
		return year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	@Override
	public void sayInfo() {
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
		System.out.println("sound enabled: " + soundEnabled);
		for (String string : list) {
			System.out.println(string);
		}
	
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

	@Override
	public void action() {
		System.out.println("action");
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}
}
