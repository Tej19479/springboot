package connectiontodatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insertquriey {
	
	
	public static void main(String[] args) {
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://sql6.freemysqlhosting.net/sql6455812","sql6455812","bzvU9grDXG");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement(); 
			String sql = "INSERT INTO Persons VALUES ('12', 'Zara', 'Ali', 'Delhi','Delhi'),('13', 'praval', 'Mishara', 'GZB','UP'),('14', 'Altfa', 'Hashami', 'Delhi','Bihar'),('12', 'Gaurav', 'kr', 'hR','hr'),('16', 'ara', 'Ai', 'Delhi','Delhi')";
	        stmt.executeUpdate(sql);
			ResultSet rs=stmt.executeQuery("select * from Persons");  
			while(rs.next())  
			System.out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}
		
		
		catch(Exception e){
				System.out.println(e);
				} 
		
		
		
		/* Driver sqlDriver = new Driver();
	     DriverManager.registerDriver(sqlDriver);
	     Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");*/
		}}
