package ru.javabegin.training.spring.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.dao.impls.SQLiteDAO;
import ru.javabegin.training.spring.dao.objects.Author;
import ru.javabegin.training.spring.dao.objects.MP3;

public class Start {

	public static void main(String[] args) {
		 MP3 firstMP3 = new MP3();
		 firstMP3.setName("Just for you");
		 
		 Author author = new Author();
		 author.setName("Mackert Dimitrij");
		 firstMP3.setAuthor(author);
		
		 MP3 secondMP3 = new MP3();
		 secondMP3.setName("Just for me");
		 secondMP3.setAuthor(author);
		
		 List<MP3> list = new ArrayList<>();
		
		 list.add(firstMP3);
		 list.add(secondMP3);
		
		// // new SQLiteDAO().insertWithJDBC(mp3);
		//
		 ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		 SQLiteDAO sqLiteDAO = (SQLiteDAO) context.getBean("sqliteDAO");
		//
		 System.out.println(sqLiteDAO.insert(firstMP3));
	}
}
