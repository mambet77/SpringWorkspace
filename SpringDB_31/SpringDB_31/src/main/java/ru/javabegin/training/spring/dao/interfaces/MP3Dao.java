package ru.javabegin.training.spring.dao.interfaces;

import java.util.List;
import java.util.Map;

import ru.javabegin.training.spring.dao.objects.MP3;

public interface MP3Dao {

	int insert(MP3 mp3);

	void delete(MP3 mp3);

	MP3 getMP3ByID(int id);
	
	void delete(int id);
	
	int getMP3Count();

	List<MP3> getMP3ListByName(String name);

	List<MP3> getMP3ListByAuthor(String author);
	Map<String, Integer> groupBy();

}
