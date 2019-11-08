package Variables;

public class StaticBlocks {

	public static void main(String[] args) {
//		Test t = new Test();
//		Test t2 = new Test();
//		Test t3 = new Test();
		
		int x = Test.count;  	// class name.variable name "Test.coun". This is have access STATIC.
								// Because the object does not own it but the class owns the STATIC.
								// it can call STATIC even without creating any object and/or constructors.
	}
}
class Test{
	
	static int count=0;						// "static" makes ++ work inside the constructor Test below
	
	static {														// ___STATIC BLOCK called before the constructors!!!		
		count=0;													// ___it can be called by "int x=Test.count;"
		System.out.println("STATIC BLOCK called, count= "+ count);	// ___wirhout any constructor or object
	}																// ___
	static {														// ....another STATIC BLOCK.
		count++;													// ....
		System.out.println("STATIC BLOCK called, count= "+ count);	// ....
	}																// ....
	
	Test(){
	
		count++;
		System.out.println("Contractor called, count= "+ count);
	
	}
	
}
