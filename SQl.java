package connectiontodatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SQl {
public static void main(String[] args) {
	
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://sql6.freemysqlhosting.net/sql6455812","sql6455812","bzvU9grDXG");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement(); 
		String sql = "INSERT INTO Persons VALUES ('9', 'Zara', 'Ali', 'Delhi','Delhi'),('9', 'praval', 'Mishara', 'GZB','UP'),('10', 'Altfa', 'Hashami', 'Delhi','Bihar'),('11', 'Gaurav', 'kr', 'hR','hr'),('12', 'ara', 'Ai', 'Delhi','Delhi')";
        stmt.executeUpdate(sql);
		ResultSet rs=stmt.executeQuery("select * from Persons");  
		while(rs.next())  
		System.out.print(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
	
	
	
	/* Driver sqlDriver = new Driver();
     DriverManager.registerDriver(sqlDriver);
     Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");*/
	
	
	
	
	
	
	
} 
	
	
	}  
	


