package Variables;

public class StaticVariables {

	public static void main(String[] args) {
		
		Test t = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
	}
}
class Test{
	
	static int count=0;						// "static" makes count++ work inside the constructor
	
	Test(){
	
		count++;
		System.out.println("Contractor called, count= "+ count);
	
	}
	
}