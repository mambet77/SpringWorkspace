package ru.javabegin.training.spring.dao.objects;

public class MP3 {

	private String name;
	private String author;
	private int id;

	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getId()
	{
		return id;
	}

}
