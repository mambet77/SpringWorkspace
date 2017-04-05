package ru.javabegin.training.spirng.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.dao.impls.SQLiteDAO;
import ru.javabegin.training.spring.dao.interfaces.MP3Dao;
import ru.javabegin.training.spring.dao.objects.MP3;

public class Start {
	
	

	public static void main(String[] args){
		MP3 mp3= new MP3();
		mp3.setAuthor("Halllloo");
		mp3.setName("Mallllo");
		mp3.setId(1);
	

		List<MP3> list= new ArrayList();
		
		list.add(mp3);
		
		 MP3 m= new MP3();
		 m.setAuthor("r");
		 m.setName("e");
		 mp3.setId(115);
		 list.add(m);
		
		ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		MP3Dao sqlLiteDao= (SQLiteDAO)context.getBean("sqliteDAO");
	//	System.out.println(sqlLiteDao.insertV2(mp3));
//		System.out.println(sqlLiteDao.getMP3ByIDV2(76));
//		System.out.println(sqlLiteDao.getMP3CountV2("Song author"));
		System.out.println(sqlLiteDao.updateList(list).length);
		sqlLiteDao.updateMp3(mp3);
		
	
	}
}
