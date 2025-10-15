abstract class Shape {
	abstract double CalculateArea();
	void display(){
		System.out.println("The area is : ");
	}
}

class Circle extends Shape{
	double r = 7.0;
	double CalculateArea(){
		double result = 3.14*r*r;
		return result;
	}
}
class Rectangle extends Shape{
	double b = 7.0;
	double l = 8.0;
	double CalculateArea(){
		double result = l*b;
		return result;
	}
}

public class AbstractClass{
	public static void main(String args[]){
		Shape c = new Circle();
		c.display();
		System.out.println(c.CalculateArea());
		
		Shape r = new Rectangle();
		r.display();
		System.out.println(r.CalculateArea());
	}
}
