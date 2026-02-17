import java.util.*;

public class Encapsulation {
     static class Student {
       private int id;
        private String name;
        private String course;

        Student(int id, String name, String course) {
            this.id = id;
            this.name = name;
            this.course = course;
        }
       int getId(){
            return id ;
        }
        String getName(){
            return name; 
        }
        String getCourse(){
            return course;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> StudentInfo = new ArrayList<>();

        StudentInfo.add(new Student(1, "aman", "mca"));
        StudentInfo.add(new Student(2, "himansu", "mca"));
        StudentInfo.add(new Student(3, "arpit", "mca"));

        System.out.println("Student ID\tName\tCourse");
        for (Student s : StudentInfo) {
            String result = String.format("%d\t\t%s\t%s", s.getId(), s.getName(), s.getCourse());
            System.out.println(result);
        }
    }
}
