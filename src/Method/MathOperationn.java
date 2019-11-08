package Method;
//https://www.youtube.com/watch?v=bggD6fs2OdM

public class MathOperationn {
	
	public static void main(String[] args) {
		int num1=2;
		int num2=3;
		int x = theAdder(2,3);
		
		System.out.println(theAdder(2,3));
		System.out.println(theMplier(2,3));
	}	
	
	public static int theAdder(int num1,int num2) {

		int adResult = num1 + num2;
		return adResult;
		
	}
	public static int theMplier(int num1,int num2) {

		int MulpResult = num1 * num2;
		return MulpResult;
		
	}

}
 