package Streamreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list = Arrays.asList(10,34,23,324,32,333,2,32); 
System.out.println("Unsorted list is "+list); 
//List<Integer> sortedList = list.stream().sorted().toList();
List<Integer> sortedList = list.stream().sorted((a,b)->b-a).toList();//this is for descending order because b-a will result in positive 
//for sorting in ascending use by default sorted or use a-b it is default condition ..
System.out.println("Sorted in descending"+sortedList); 
sortedList=list.stream().sorted((a,b)->a-b).toList();
System.out.println("Sorted in ascending"+sortedList);

//practice 3
List<Integer>dataset=list.stream().sorted((a,b)->b-a).limit(3).toList(); //we can use .skip(list.size()-3) if  the list is ascending 
System.out.println("Top 3 highest number are "+dataset);
//practice 4
List<Integer>even=list.stream().filter(x->x%2==0).sorted().toList(); 
System.out.println(even); 
//practice  6
List <Integer> duplicate=list.stream().distinct().sorted().toList(); 
System.out.println("List after removing duplicates are :"+duplicate) ;
//practice 7 
  list.stream().sorted().skip(list.size()-2).limit(1).forEach(x->System.out.println(x));
  //practice 8 
  list.stream().filter(x->x>20).sorted().forEach(x->System.out.print(x+" "));
  //practice 9 
  System.out.println(); 
  List<String> names1 = Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");//sorted((a,b)->a.compareTo(b)) we can also use this to sort ascending
  names1.stream().sorted().forEach(x->System.out.print(x+" "));
  System.out.println();
  //practice 11
  names1.stream().sorted((a,b)->b.compareTo(a)).forEach(x->System.out.print(x+" ")); //we can use comparator.reverseOrder
  //practice 12 
  System.out.println();//sort on based on their length 
  names1.stream().sorted((a,b)->a.length()-b.length()).forEach(x->System.out.print(x+" "));
  //practice 13 
  System.out.println();
  list.stream().filter(x->x%5==0).sorted().forEach(x->System.out.println(x+" "));
  //practice 14 
  list.stream().sorted().limit(1).forEach(System.out::print);
  
 //practice 17:- List<Employee>list = new ArrayList(new Employee(1,"Rahul",20000,"IT"); 
  // we have 5 elements in the list:: like e1, e2 ,e3,e4 and e5; 
//  Now , sort the list with salary and department value; 
  List<Employee>l1=new ArrayList<>();
  l1.add(new Employee(1,"Rahul",20000,"IT")); 
  l1.add(new Employee(2,"Kunal",25000,"ME")); 
  l1.add(new Employee(3,"Ramu",40000,"Civil")); 
  l1.add(new Employee(4,"Dogesh",70000,"HR")); 
  l1.add(new Employee(5,"Raju",7000,"Peon")); 
  
  List<Employee> sortedListt=l1.stream().sorted((e1,e2)->e1.sallary-e2.sallary).toList(); 
	}
	System.out.println();

}
class Employee{
	int id; 
	String Name ;
	int sallary; 
	String dept; 
	Employee(int id, String Name, int sallary , String dept){
		this.id=id; 
		this.Name=Name; 
		this.sallary=sallary ;
		this.dept = dept ; 
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", sallary=" + sallary + ", dept=" + dept + "]";
	}
}
