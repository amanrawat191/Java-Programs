package default_package;

interface Area{
	double PI=3.14;
	double getArea();
}
class Circle implements Area{
	double r; 
	Circle(double r){
		this.r = r;
	}
	public double getArea() {
		double result= PI*r*r; 
		return result ; 
	}
}

public class AreaMain {
 public static void main(String[] args) {
	 Circle c1=new Circle(14.5); 
	 System.out.println("Area of Circle="+c1.getArea());
	 Area c2= new Circle(16.5); 
	 System.out.println("Area of Circle="+c2.getArea());
	 Area r1=new Area() { //ye ek subclass h
		//ye class hai anoynimous class without name 
		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			int l=10, b =40; 
			return (l*b); 
		}
		};
		System.out.println("Area of Rectangle ="+r1.getArea());
		
 }
}
