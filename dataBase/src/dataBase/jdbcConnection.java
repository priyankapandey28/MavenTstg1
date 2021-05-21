package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "3306";
		
		//database
		/*
		 Create database qadbt;
			use qadbt;
			create table EmplyeeInfo(username varchar(20), password varchar(10), age int, location varchar(20));
			insert into EmplyeeInfo values(‘Sam’,’passwrd’, 32, ‘Mumbai’);

		 */
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" +host+ ":" +port+ "/qadbt", "root", "root");
		Statement s=con.createStatement();
		ResultSet rs = s.executeQuery("select * from EmplyeeInfo;");
		
		while(rs.next())
		{
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
	}
	}
}
