class car{
    void run(){
        System.out.println("class car is running broomm");
    }
}
@FunctionalInterface
interface myinterface{
  void myrun();
}
public class methodreferncing {
    public static void main(String[] args) {
       myinterface m1= ()->{
            System.out.println("My car is running");
        };
        m1.myrun();
    car c1 = new car(); 
    m1 = c1::run;
    m1.myrun();
    }
}
