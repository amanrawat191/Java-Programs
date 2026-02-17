
@FunctionalInterface
interface vote {
    boolean canvote(int age);

}
public class lambda3 {
    public static void main(String[] args) {
        
        vote a1 = (int num) -> {
            if (num > 18)
                return true;
            else
                return false;
        };
        System.out.println(a1.canvote(34));
    }
}
