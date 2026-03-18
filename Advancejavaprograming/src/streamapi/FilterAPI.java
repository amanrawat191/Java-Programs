package streamapi;
import java.util.*;
import java.util.stream.Stream; 
import java.util.function.Consumer;

public class FilterAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer>list= new ArrayList<Integer>(); 
     list.add(23);
     list.add(45); 
     list.addAll(List.of(23,56,78,23,45,67));
     System.out.println(list);
    // Stream listStream = list.stream();
     
//    listStream.forEach((element)->System.out.print(element+ " "));
//     listStream.forEach(System.out::println);
     
     list.stream().filter(n->n>60).forEach((element)->System.out.print(element+" "));
     
     
//     list.stream().forEach(System.out::println);
     System.out.println("Count="+list.stream().filter((item)->item>60).count());
     List<Integer>g60=list.stream().filter((x)->x<60).toList();	
     System.out.println(g60);
     }

}
