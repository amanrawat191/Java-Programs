package questions;
import java.util.*; 
import java.util.Arrays;

public class Mapex {
public static void main(String [] args) {
	List<Integer> numbers = Arrays.asList(23,32,45,35,67,89,95); 
	ArrayList<Integer>list=new ArrayList<Integer>();
   list.addAll(numbers); 
   System.out.println(list);
   List<Integer> result = list.stream().filter(n->n<40).map(x->x+5).toList(); 
   System.out.println(result);
   //practice 1 
   List<String> names= Arrays.asList("sachin","rahul","amit");
   List<String>Result=names.stream().map(x->x.toUpperCase()).toList();
   System.out.println(Result);
   //practice 2 
   result=list.stream().map(x->x*x).toList(); 
   //toList ke badle .collect(Collectors.toList()); use krna if you want to manupulate result ; 
   System.out.println(result);
   //practice 3
   Result.stream().forEach(x->System.out.print(x.charAt(0)));
   //practice 4
   System.out.println();
   //practice 5
   Result.stream().forEach(x->System.out.print("item-"+x+" "));
   //practice 7 
   
   List<String> Employee = Arrays.asList(("aman"),("rahul"));
   Employee.forEach(System.out::print);
   
   
}
}
