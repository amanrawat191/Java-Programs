package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*; 
public class EmpDB{
	public static void main(String[] args) {
		String driver_name = "com.mysql.cj.jdbc.Driver";
		String host="jdbc:mysql://localhost:3306/employeedb";
		String username="root"; 
		String pwd="root";
		String create_table=""" 
				CREATE TABLE IF NOT EXISTS employee (
				id INT PRIMARY KEY AUTO_INCREMENT,
				name VARCHAR(50) NOT NULL,
				dept VARCHAR(50),
				salary DECIMAL(10,2)
				)
				""";
		try {
			Class.forName(driver_name); 
			System.out.println("Driver is ready!"); 
			Connection con = DriverManager.getConnection(host, username, pwd);
		    System.out.println("Host is ready!");
		    Statement smt=con.createStatement(); 
		    smt.execute(create_table); 
		    System.out.println("Table is ready!");
		    ResultSet rs = smt.executeQuery("select * from employee"); 
		    System.out.println("ID\tName\tDept\tSalary"); 
		    while(rs.next()) {
		    	int id = rs.getInt("id"); 
		    	String name=rs.getString("name"); 
		    	String dept=rs.getString("dept"); 
		    	long salary = rs.getLong("salary"); 
		    	System.out.println(String.format("%d\t%s\t%s\t%d",id,name,dept,salary));
		    }
		    
//		   int rowAffected = smt.executeUpdate("""
//		    		insert into employee
//		    		(name,dept,salary) values('Emp3','Accounts',45000),('Emp4','IT',50000)
//		    		""");
//		   if(rowAffected>0) {
//			   System.out.println("Record inserted!");
//		   }
//		   else {
//			   System.out.println("Record is not inserted!");
//		   }
		    
		    rs.close();
			smt.close();
			con.close();
		}
		
		catch (Exception e)
		{
			e.printStackTrace(); 
		}
}}