class Animal{
 String name ; //instance variable 
 String sound ;//within a class outside the method is called instance variable
 Animal(){
this("cat1","");
 }
 Animal(String name, String sound){
    this.name=name; 
    this.sound=sound;
 }
 void getInfo(){
    System.out.println("Name = "+name);
    System.out.println("Sound = "+sound);
 }
 void getInfo(String name, String sound , int legs){
    System.out.println("Name = "+ name);
    System.out.println("Sound = "+sound);
    System.out.println("No. of Legs = "+legs);
 }
}
class Cat extends Animal{
Cat(String name, String sound){
// this.name=name; 
// this.sound=sound; 
super(name,sound);
}
void getInfo(){
    System.out.println();
}
}


public class PolyMain {
    public static void main(String[] args) {
// the ability of an object to have multiple form or behaviour on different situation
        //is called polymorphism
  Animal obj= new Animal("Horse", "Hingggg");
  obj.getInfo();
  obj.getInfo("Cat","Meow", 4);
  Cat c1= new Cat("billi","moew"); 
  c1.getInfo();
    }
}
