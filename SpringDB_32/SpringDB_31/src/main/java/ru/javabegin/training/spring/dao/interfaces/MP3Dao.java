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

	String getMP3ByIDV2(int id);



	int getMP3CountV2(String name);

	int insertV2(MP3 mp3);

	void insertList(List<MP3> list);

	int[] updateList(List<MP3> list);

	void updateMp3(MP3 mp3);

}
