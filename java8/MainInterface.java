interface Calc {
    void calculate(int n1, int n2);

    default void calculate(int n1, int n2, int n3) {
        int s = n1 + n2 + n3;
        // System.out.println("Sum ="+s);
        getPrivateInfo("Sum=" + s);
    }

    static String getInfo() {
        return " this is getInfor method inside Calc Interface";
    }

    private void getPrivateInfo(String msg) {
        System.out.println(msg);
    }
}

class calculator implements Calc {
    @Override
    public void calculate(int n1, int n2) {
        int s = n1 + n2;
        System.out.println("Sum=" + s);
    }
}

public class MainInterface {
    public static void main(String[] args) {
        calculator obj = new calculator();
        obj.calculate(4, 3);
        obj.calculate(3, 4, 5);
        System.out.println(Calc.getInfo());
    }
}
