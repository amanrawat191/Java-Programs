public class MainVar {
    public static void main(String[] args) {
        int a=10;
        var b=20;//after java 10 we can use var keyword in java with some limitation 
        var name1="kiet mca"; //local variable type inference
        var value=10.34;
          //type inference means we have to give it type at declaration 
        //initialisation is must at the time of declaration like var=10; 
        String name=new String("This is String");
        var nam3=new String ("This is string with var");
        int arr[]={1,2,4,5,6};
        for(var da: arr){
          System.out.println(da);
        }
}
}
