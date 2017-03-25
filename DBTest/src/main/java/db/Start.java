package db;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String args[]){
		
		ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		
		Mp3Dao mp3Dao= (Mp3Dao)context.getBean("JDBCMp3");
		
		mp3Dao.saveMp3(new Mp3("Song09780970970s", "Autor13"));
		mp3Dao.delete(4);
	}
}
