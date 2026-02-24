sealed class Shape permits Circle,Rectangle{ 


}
final class Circle extends Shape{
//it will not inherit furtheer
}
sealed class Rectangle extends Shape permits ABC{
//it can be inherit further but only permited classes
}
non-sealed class ABC extends Rectangle{
//it is free for all to inherit 
}
public class MainSealed {
    public static void main(String[] args) {
        
    }
}
