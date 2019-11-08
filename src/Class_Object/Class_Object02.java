package Class_Object;
public class Class_Object02 {

	public static void main(String[] args) {
		Circle2 c1 = new Circle2();									//creating object c1
		c1.findArea(3.5);
	
		Circle2 c2 = new Circle2();									//creating object c2
		c2.findArea(4.1);

	}
}
														// Creating class named Circle2
class Circle2 {
	double radius;
	double area;
	
	public void findArea(double r)
	{
		radius = r;
		area = r*r*3.14;
		System.out.println(area);
		
	}
}

