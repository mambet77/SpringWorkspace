package ru.javabegin.training.spring.dao.impls;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import ru.javabegin.training.spring.dao.interfaces.MP3Dao;
import ru.javabegin.training.spring.dao.objects.MP3;

@Component("sqliteDAO")
public class SQLiteDAO implements MP3Dao {

	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcInsert insertActor;
	DataSource dataSource = null;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.insertActor = new SimpleJdbcInsert(dataSource).withTableName("mp3").usingGeneratedKeyColumns("id");
	}

	@Override
	public void delete(MP3 mp3) {
		delete(mp3.getId());
	}

	@Override
	public MP3 getMP3ByID(int id) {
		// MapSqlParameterSource params= new MapSqlParameterSource();
		// params.addValue("id", id);
		String sql = "select * from mp3 where id=?";
		return jdbcTemplate.queryForObject(sql, new MP3RowMapper(), id);
	}

	@Override
	public int getMP3Count() {
		String sql = "select count(*) from mp3";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	@Override
	public List<MP3> getMP3ListByName(String name) {
		String sql = "select * from mp3 where upper(name) like :name";
		return jdbcTemplate.query(sql, new MP3RowMapper(), name);
	}

	@Override
	public List<MP3> getMP3ListByAuthor(String author) {
		String sql = "select * from mp3 where upper(author) like :name";
		return jdbcTemplate.query(sql, new MP3RowMapper(), author);
	}

	@Override
	public void delete(int id) {
		String sql = "delete from mp3 where id=?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public int insert(MP3 mp3) {
		
		String sql = "insert into mp3 (name, author) VALUES (?,?)";
		jdbcTemplate.update(sql, new Object[] { mp3.getName(), mp3.getAuthor() });
		
		Map<String, Object> parameters = new HashMap<String, Object>(2);
		parameters.put("name", mp3.getName());
		parameters.put("author", mp3.getAuthor());
		
		return (int) insertActor.executeAndReturnKey(parameters);
	}
	
	public Map<String, Integer> groupBy(){
	
		String sql = "select author, COUNT(*) as count from mp3 group by author";
		 return jdbcTemplate.query(sql, new ResultSetExtractor<Map<String, Integer>>(){

			@Override
			public Map<String, Integer> extractData(ResultSet rs) throws SQLException, DataAccessException {
				Map<String, Integer> map= new TreeMap<>();
				
				while(rs.next()){
					String author=rs.getString("author");
					int count =rs.getInt("count");
					map.put(author, count);
					
				}
				return map;
			}
			 
		 });
	}

	private static final class MP3RowMapper implements RowMapper<MP3> {

		@Override
		public MP3 mapRow(ResultSet rs, int rowNum) throws SQLException {
			MP3 mp3 = new MP3();
			mp3.setId(rs.getInt("id"));
			mp3.setAuthor(rs.getString("author"));
			mp3.setName(rs.getString("name"));
			return mp3;
		}
	}
}
