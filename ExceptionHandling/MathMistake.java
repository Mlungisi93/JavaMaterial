package ExceptionHandling;

public class MathMistake {

	public static void main(String[] args) {

		mistakeThree();
	}
	
	public static void mistakeOne()
	{
		float result = 10/0;
	}

	public static void mistakeTwo()
	{
		try{
			mistakeOne();
		}catch(ArithmeticException e){
			System.out.println("Do something here about "+e.getMessage());
		}
	}
	
	public static void mistakeThree()
	{
		String[] strings = {"one","two","three"};
		try{
			for(int i=0; i<=strings.length; i++){
				System.out.println("Array position "+i+" contains string value :  "+strings[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Woops we overran because we allowed execution count to exceed array length :  "+e.getMessage());
		}
	}
}
