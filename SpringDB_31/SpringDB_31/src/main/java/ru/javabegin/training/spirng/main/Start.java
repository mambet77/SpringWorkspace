package ru.javabegin.training.spirng.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.dao.impls.SQLiteDAO;
import ru.javabegin.training.spring.dao.interfaces.MP3Dao;
import ru.javabegin.training.spring.dao.objects.MP3;

public class Start {
	
	

	public static void main(String[] args){
		MP3 mp3= new MP3();
		mp3.setAuthor("Author author");
		mp3.setName("Song Sooonh name");
	

		
		ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		MP3Dao sqlLiteDao= (SQLiteDAO)context.getBean("sqliteDAO");
		//System.out.println(sqlLiteDao.insert(mp3));
		System.out.println(sqlLiteDao.getMP3Count());
		System.out.println(sqlLiteDao.groupBy());
		
	
	}
}
