package Streamreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(12,1,4,100,200,150,45,67,99); 
		 Optional<Integer>result = list.stream().min((a,b)->a-b); 
		
        result.ifPresent(System.out::println);
         Optional<Integer>result2 = list.stream().max((a,b)->a-b); 
		
        result2.ifPresent(System.out::println);
        //practice 1
         Optional<Integer>practice1=list.stream().min((a,b)->a-b);
         practice1.ifPresent(System.out::println);
         //practice 2 
         Optional<Integer>practice2=list.stream().max((a,b)->a-b);
         practice2.ifPresent(System.out::println);
         //practice 11
         list.stream().skip(5).forEach(x->System.out.print(x+" "));
         //practice 12 
         List <String> names = Arrays.asList("Aman","Ram","Bhola","Gokul"); 
        Optional<String>Practice9= names.stream().min((a,b)->a.compareTo(b));
        Practice9.ifPresent(x->System.out.println(x)); 
        
	}

}
