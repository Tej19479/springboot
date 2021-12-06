package connectiontodatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;

public class insertqureyindatbase {

public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the id number ");
	int PersonID  = scanner.nextInt();

	System.out.println("Enter your last name: ");
	String LastName = scanner.next();

	System.out.println("Enter your frist name: ");
	String FirstName = scanner.next();	
	
   System.out.println("Enter in address ");
    String Address = scanner.next();
    
   System.out.println("Please Enter the city");
   String City = scanner.next();
   try {
   Class.forName("com.mysql.jdbc.Driver");  
	System.out.println("1");
	Connection con=DriverManager.getConnection(  
 "jdbc:mysql://sql6.freemysqlhosting.net/sql6455812","sql6455812","bzvU9grDXG"); 
	Calendar calendar = Calendar.getInstance();


   String sql = "insert into Persons (PersonID , LastName, FirstName, Address, City)"+" values (?, ?, ?, ?, ?)"; 
	Statement stmt=con.prepareStatement(sql);
	
	
	stmt.executeUpdate(sql);

	ResultSet rs=stmt.executeQuery("select * from Persons");  
	 System.out.println("hello");
	
   }catch (Exception e) {
	// TODO: handle exception
}
	
}

private static void executeUpdate(String sql) {
	// TODO Auto-generated method stub
	
}	
	
	
}
