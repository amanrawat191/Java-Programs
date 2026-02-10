public class StudentMain {
    public static void main( String[] args){
        Student s1 =new Student ("Student1","MCA",1);
        s1.setSid(2);
        System.out.println("Sid="+s1.getCourse());
        System.out.println("Name="+s1.getname());
        System.out.println("Course="+s1.getCourse());
    }
}
