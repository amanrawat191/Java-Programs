import java.util.*; 
record Student (int sid, String name, String course){}; 
public class MainRecords {
    public static void main(String[] args) {

        int data[]=new int[] { 23, 45, 67,89,23};
        List<Integer> listData=Arrays.stream(data).boxed().toList();
        // listData.forEach((item)->System.out.println(item));
        listData.forEach(System.out::println);
        // List<int[]>listData = Arrays.asList(data);
        // System.out.println(listData.get(0)[0]);
        // Student s= new Student (1,"Student 1","MCA");
        // System.out.println(s.sid());
        // System.out.println(s.name());
        // System.out.println(s.course());
        // System.out.println(s);
    }
}
