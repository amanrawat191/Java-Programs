import java.util.*;
public class encapsulation {
    static class Student{
        int id;
        String name; 
        String course;
        Student(int id , String name, String course){
            this.id=id;
this.name = name; 
this.course = course;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <Student>StudentInfo = new ArrayList<>();
        
        StudentInfo.add(new Student(1,"aman","mca"));
        StudentInfo.add(new Student(2,"himansu","mca"));
        StudentInfo.add(new Student(3,"arpit","mca"));
        
        System.out.println("Student ID\tName\tCourse");
        for(Student s: StudentInfo){
            String result = String.format("%d\t\t%s\t%s",s.id,s.name,s.course);
            System.out.println(result);
        }
    }
}
