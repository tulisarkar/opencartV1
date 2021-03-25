package day26_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*create connection
create statement/query
execute statement/query
close connection*/

public class JDBCdemo1 {

	public static void main(String[] args) throws SQLException {
	
		//establish connection between eclipse/java with database
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		//create a statement or query
		Statement stmt=con.createStatement();
		
		//execute query		
		//String query="insert into Student values(106,'David')";
		//String query="update Student set stuname='Oliver' where stuid=102;";
		//String query="delete from Student where stuid=102";
		//stmt.execute(query);
		
		//when using select command results will be returned which has to be stored in result object
		
		String query="select * from Student";
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next())
		{
			int mystuid=rs.getInt("stuid");
			String mystuname=rs.getString("stuname");
			System.out.println(mystuid+"     "+ mystuname);
		}
		//close connection
		con.close();
		System.out.println("program is done");
		

	}

}
