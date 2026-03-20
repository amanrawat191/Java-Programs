package questions;

import java.util.ArrayList;
import java.util.List;

public class map7 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList<Employee>list =  new ArrayList<Employee>(); 
  list.add(new Employee(1,"Ankit","Mca")); 
  list.add(new Employee(2,"rahul","cse")); 
  List<String> empNames = list.stream().map(x->x.ename).toList(); 
  System.out.println(empNames);
	}

}
class Employee{
	int eid; 
	String ename; 
	String dept ; 
	Employee(int eid, String ename, String dept ){
		this.eid=eid; 
		this.ename= ename ; 
		this.dept = dept; 
	}
}
