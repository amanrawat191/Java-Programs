record Student (int sid, String name, String course){}; 
public class MainRecords {
    public static void main(String[] args) {
        Student s= new String (1,"Student 1","MCA");
        System.out.println(s.sid());
        System.out.println(s.name());
        System.out.println(s.course());
        System.out.println(s);
    }
}
