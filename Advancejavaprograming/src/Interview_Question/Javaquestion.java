package Interview_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class Javaquestion {

    static class Employee {
        int id;
        String name;
        double salary;
        int age;
        String department;

        public Employee(int id, String name, double salary, int age, String department) {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.age = age;
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        // Optional but useful for printing
//        public String toString() {
//            return id + " " + name + " " + salary + " " + age + " " + department;
//        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
                new Employee(101, "Amit", 50000, 25, "IT"),
                new Employee(102, "Neha", 60000, 28, "HR"),
                new Employee(103, "Ravi", 45000, 24, "IT"),
                new Employee(104, "Karan", 70000, 30, "Finance"),
                new Employee(105, "Pooja", 55000, 27, "HR"),
                new Employee(106, "Rohit", 80000, 32, "IT"),
                new Employee(107, "Simran", 65000, 29, "Finance"),
                new Employee(108, "Amit", 50000, 25, "IT")
        ));

        // Minimum salary
        Optional<Employee> result = empList.stream()
                .min((a, b) -> Double.compare(a.getSalary(), b.getSalary()));

        result.ifPresent(System.out::println);

        // Maximum salary
        Optional<Employee> result2 = empList.stream()
                .max((a, b) -> Double.compare(a.getSalary(), b.getSalary()));

        result2.ifPresent(System.out::println);
    }
}