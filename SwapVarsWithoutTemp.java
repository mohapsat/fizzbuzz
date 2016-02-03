public class SwapVarsWithoutTemp {

	public static void main(String[] args) {
	
	
	//initialize vars

	int a = 10;
	int b = 20;

	System.out.println("Before swap: a =" + a + " b = " + b);

	//swap

	a = a - b ; //a is -10
	b = b + a ;//b is 10
	a = b - a ;

	System.out.println ("After swap: a = " + a + " b = " + b);
	
	}



}
