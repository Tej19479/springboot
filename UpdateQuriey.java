package connectiontodatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateQuriey {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://sql6.freemysqlhosting.net/sql6455812","sql6455812","bzvU9grDXG");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement(); 
			String sql = "UPDATE Persons " +
		            "SET PersonID = 8 WHERE LastName in ('Zara')";
			stmt.execute(sql);
			ResultSet rs=stmt.executeQuery("select * from Persons");  
			while(rs.next())  
			System.out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
		
		
	}
}
