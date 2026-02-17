@FunctionalInterface
interface Calc{
String square(int n1);
}
public class lambda2 {
    public static void main(String[] args) {
        Calc a1 = (int num)->{
          return "the square of the number is "+(num*num);
        };
        System.out.println(a1.square(22));
    }
    
}
