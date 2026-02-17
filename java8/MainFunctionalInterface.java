

@FunctionalInterface 
//It means only single abstract method can be inside this method 
//default static ,private can come inside this --no limit
interface Add{
    int calculate (int n1, int n2);
   default void  calculate(int n1, int n2, int n3){

   }
   static void calculate ( int n1 , int n2 , int n3,int n4 ){

   }
}

public class MainFunctionalInterface {
    public static void main(String[] args) {
        Add a = new Add(){    //Anoyminous class
            public int calculate (int n1, int n2){
                return (n1 + n2);

            }
        };
        System.out.println("Sum="+a.calculate(23,34));
        Add a1= (int n1 , int n2)->(n1 +n2);//lambda Expression
        System.out.println("Sum="+a1.calculate(23,534));
    }
}
