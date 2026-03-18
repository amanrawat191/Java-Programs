package questions;
import java.util.*; 
public class q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Student newStudent1= new Student("aman",42);
//  Student newStudent2=new Student("rajeev",43); 
//  Student newStudent3=new Student("rohan",44);
//  
		ArrayList<Student>list = new ArrayList<Student>(); 
		list.add(new Student("Aman",30)); 
		list.add(new Student("Rajeev",44)); 
		list.add(new Student("Hemank",55)); 
		list.add(new Student("Arpit",66));
		list.add(new Student("himanshu",60));
		System.out.println("\t Name\t\t Marks");
		list.stream().filter(Student->Student.getMarks()>60).
		forEach(S->
		{String result=String.format("\t%s\t\t%d",S.getName(),S.getMarks());
		System.out.println(result);}); 
		
	}}
 class Student{
	 private String name; 
	private int marks; 
       Student(String name , int marks){
		super(); 
		this.name=name; 
		this.marks= marks; 
		}
	   public String getName() {
		   return name;
	   }
	   public void setName(String name) {
		   this.name = name;
	   }
	   public int getMarks() {
		   return marks;
	   }
	   public void setMarks(int marks) {
		   this.marks = marks;
	   }
      
}

