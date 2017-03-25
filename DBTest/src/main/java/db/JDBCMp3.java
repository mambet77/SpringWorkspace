package db;


import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("JDBCMp3")
public class JDBCMp3  implements Mp3Dao{

	private JdbcTemplate  jdbcTemplate;
	DataSource dataSource;
	
	
	public void saveMp3(Mp3 mp3) {
		
	

		String sql="insert into mp3 (Name, Author) VALUES (?,?)";
		jdbcTemplate.update(sql, new Object[]{mp3.getAuthor(), mp3.getName()});
		System.out.println(mp3.getId());

		
	}
	
	public void delete(int id) {
		String sql="delete from mp3 where id=?";
		jdbcTemplate.update(sql, id);
		
	}
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		
		jdbcTemplate  = new JdbcTemplate(dataSource);
	}

}
