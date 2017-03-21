package MYDB.testDB;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException 
    {
    	Connection con = null;
    	Statement stmt=null;
    	DriverManager.setLogWriter( new PrintWriter( System.out ) );
    	  try {
			Class.forName( "org.hsqldb.jdbcDriver" );
			
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	 
    	  try {
			 con = DriverManager.getConnection( "jdbc:hsqldb:file:tutDB;shutdown=true",
			          "sa",
			          "" );
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	  
    	  try {
			 stmt = con.createStatement();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
    	  String query = "SELECT * FROM CUSTOMER";
    	  ResultSet rs = stmt.executeQuery( query );
    	  
    	  while ( rs.next() )
    		  System.out.printf( "%s, %s, %s%n", rs.getString(1),
    		                     rs.getString(2), rs.getString(3) );
    	
//    	 
    }
}
