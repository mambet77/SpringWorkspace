package db;

public class Mp3 {

	
	private String author;
	private String name;
	private int id;
	public Mp3(String song, String author) {
		this.name=song;
		this.author=author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String song) {
		this.name = song;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
