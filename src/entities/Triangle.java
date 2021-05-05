package entities;

public class Triangle {
	
	public double a;
	public double b;
	
	public double area() {
		double area = a*b; 
		return area;
	}
	public double perimeter() {
		double perimeter = 2*(a+b);
		return perimeter;
	}
	public double diagonal() {
		double diagonal = Math.sqrt(a*a + b*b);
		return diagonal;
	}

}
