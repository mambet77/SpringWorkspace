package ru.javabegin.training.spring.dao.impls;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import ru.javabegin.training.spring.dao.interfaces.MP3Dao;
import ru.javabegin.training.spring.dao.objects.MP3;

@Component("sqliteDAO")
public class SQLiteDAO implements MP3Dao {
	
	private JdbcTemplate  jdbcTemplate;
	DataSource dataSource=null;
	
	
	@Autowired 
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		
	}

	@Override
	public void insert(MP3 mp3) {
		String sql="insert into mp3 (name, author) VALUES (?,?)";
		mp3.setId(jdbcTemplate.update(sql, new Object[]{mp3.getAuthor(), mp3.getName()}));
		System.out.println(mp3.getId());
	}

	@Override
	public void delete(MP3 mp3) {
	
	delete(mp3.getId());
	}

	@Override
	public MP3 getMP3ByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MP3> getMP3ListByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MP3> getMP3ListByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		String sql="delete from mp3 where id=?";
		jdbcTemplate.update(sql, id);
		
	}
}
