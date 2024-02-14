import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			//String url = "jdbc:mysql://localhost/MYDB";
			Class.forName ("oracle.jdbc.driver.OracleDriver").newInstance ();
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "sanjay");
			//Class.forName ("oracle.jdbc.driver.OracleDriver").newInstance ();
			//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "sanjay");
			//Statement stmt = con.createStatement();
			System.out.println("Connected");
			con.close();
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}