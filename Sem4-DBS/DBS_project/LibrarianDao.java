import java.sql.*;
public class LibrarianDao {

	
	public static int save(String lid,String name,String password,String email,String address,String city,String contact){
		int status=0;
		try{
			//Connection con=DB.getConnection();
			Class.forName("oracle.jdbc.driver.OracleDriver");			
	        // step2 create the connection object			
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "sanjay");			
	        // step3 create the statement object			
	        Statement stmt = con.createStatement();
	        //stmt.executeUpdate("CREATE TABLE librarian(name varchar(20),password varchar(20), email varchar(20), address varchar(20), city varchar(20), contact number(10));");
	        System.out.println("\nTable is created\n");
			PreparedStatement ps=con.prepareStatement("insert into librarian(L_id,Name,Password,Email,Address,City,Contact_no) values(?,?,?,?,?,?,?)");
			ps.setString(1,lid);
			ps.setString(2,name);
			ps.setString(3,password);
			ps.setString(4,email);
			ps.setString(5,address);
			ps.setString(6,city);
			ps.setString(7,contact);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			//Connection con=DB.getConnection();
			Class.forName("oracle.jdbc.driver.OracleDriver");			
	        // step2 create the connection object			
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "sanjay");			
	        // step3 create the statement object			
	        //Statement stmt = con.createStatement();
			PreparedStatement ps=con.prepareStatement("delete from librarian where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static boolean validate(String name,String password){
		boolean status=false;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "sanjay");
			//Statement stmt = con.createStatement();
			
			//Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from librarian where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}