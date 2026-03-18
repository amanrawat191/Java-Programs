package questions;
import java.util.*;
import java.util.stream.Stream; 
import java.util.function.Consumer;
public class streamquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list= List.of(10,15,20,25,30,35,40,55,60,70);
     ArrayList<Integer>alist= new ArrayList<>();
     alist.addAll(list);
     alist.stream().filter(x->x%2==0).forEach(System.out::println);
     //2nd question 
     List<String> slist= List.of("Amit","Ravi","Anil","Vikash","Rahul");
     ArrayList<String>stringlist= new ArrayList<>();
     stringlist.addAll(slist);
     stringlist.stream().filter(x->x.startsWith("A")).forEach(System.out::println);
     //3rd question
     alist.stream().filter(x->x>50&&x<=60).forEach(System.out::println);
     //4th question
     slist.stream().filter(x->x.length()>4).forEach(System.out::println);
     
    //5th question 
     List<String> nolist = Arrays.asList("Java",null,"spring","React");
    ArrayList<String> nullist= new ArrayList<>(); 
    nullist.addAll(nolist);
    List<String>newList=nolist.stream().filter(x->x!=null).toList();
    System.out.println(newList);
    //6th 
    
    alist.stream().filter(x->x%2!=0).forEach(System.out::println);
    //7TH
    
    
     //repeated number
    List<Integer>data = Arrays.asList(10,30,40,40,23,30,33,33,19,19,33); 
    ArrayList<Integer>arrlist=new ArrayList<Integer>();
    arrlist.addAll(data);
    arrlist.stream().distinct().filter(x->x>15).forEach(System.out::println);; 
    //create a student class (name , marks) and write a java program using Stream api filter()to print student whose marks are greater than 60; 
    
	}

}
