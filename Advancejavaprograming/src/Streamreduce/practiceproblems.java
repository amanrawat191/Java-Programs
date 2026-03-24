package Streamreduce;

import java.util.Arrays;
import java.util.List;

public class practiceproblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(10,20,30,40,50); 
//practice question 1 
   int sum =list.stream().reduce(0,(a,b)->a+b); 
   System.out.println("Sum is "+sum); 
   //practice question 2 
   long mul = list.stream().reduce(1,(a,b)->a*b); 
   System.out.println("Multiplication is "+mul); 
   //practice question 3
   int maxElement= list.stream().reduce(0,(a,b)->a>b?a:b ); 
		   System.out.println("Maximum element is "+maxElement); 
   //practice question 4
   int minElement=list.stream().reduce(list.get(0),(a,b)->a<b?a:b);
   System.out.println("Minimum element is "+minElement); 
   //practice question 5
   int count= list.stream().reduce(0,(a,b)->a+1 );
   System.out.println("Count="+count); 
   //practice question 6
   int evensum = list.stream().filter(x->x%2==0).reduce(0, (a,b)->a+b); 
   System.out.println("Sum of even numbers is "+evensum);
   //practice question 7 
   List <String> list1=Arrays.asList("java","python","cpp"); 
		   String finalList=list1.stream().reduce("",(a,b)-> a+" " +b );
   System.out.println(finalList); 
		 
		   
 //practice question 8  find sum of squares of a list , using reduce 
		   
	}

}
