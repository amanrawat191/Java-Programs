package Streamreduce;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =Arrays.asList(34,12,10,10,34,34);
		int sum = list.stream().reduce(0,(a,b)->a+b); 
		System.out.println("Sum="+sum);
		double avg= sum/list.size(); 
		System.out.println("Avg="+avg);
		long mul= list.stream().reduce(1,(a,b)->a*b); 
		System.out.println("multiplication= "+mul); 
		
	}

}
