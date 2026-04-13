package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*; 
public class PreEmp{
	public static void main(String[] args) {
		String driver_name = "com.mysql.cj.jdbc.Driver";
		String host="jdbc:mysql://localhost:3306/employeedb";
		String username="root"; 
		String pwd="root";
		String query="select * from employee where salary>=?";
		long inputSalary=45000;
		String insertQuery="insert into employee(name,dept,salary) values(?,?,?)"; 
		try {
			Class.forName(driver_name); 
			Connection con = DriverManager.getConnection(host, username, pwd);
			PreparedStatement inpst=con.prepareStatement(insertQuery);
			inpst.setString(1,"Emp6"); 
			inpst.setString(2,"MCA"); 
			inpst.setLong(3,65000); 
			inpst.executeUpdate(); 
			PreparedStatement pst=con.prepareStatement(query);
			pst.setLong(1, inputSalary);
			ResultSet rs=pst.executeQuery();
			System.out.println("ID|Name|Dept|Salary"); 
			while(rs.next()) {
		    	int id = rs.getInt("id"); 
		    	String name=rs.getString("name"); 
		    	String dept=rs.getString("dept"); 
		    	long salary = rs.getLong("salary"); 
		    	System.out.println(String.format("%d|%s|%s|%d",id,name,dept,salary));
		    }
		}catch (Exception e)
		{
			e.printStackTrace(); 
		}
	}


		
}