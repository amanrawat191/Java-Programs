public class lambda {

    @FunctionalInterface
    interface Calc {
        void calculate();  
        // iska lambda function bnega without return type without parameter

    }

    public static void main(String[] args) {

        Calc a1 = () -> {
            int num1=10; 
            int num2 = 30; 
            System.out.println("The sum of these two numbers are "+ (num1+num2));
        };
           a1.calculate();
    }
}
