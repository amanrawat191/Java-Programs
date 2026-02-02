class Sum {
    void displaySum(int a, int b) {
        System.out.println("Addition : "+(a + b));
    }
}

class Substract {
    
    Substract(int a, int b) {
        System.out.println("subtraction : "+(a - b));

    }
}

public class Calculator {
    public static void main(String[] args) {
        Sum add = new Sum();
        Substract minus = new Substract(2, 4); // passing in constructor
        add.displaySum(3, 4); // passing in function

    }
}
