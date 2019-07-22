package ExceptionHandling;

import java.util.Scanner;

public class MenuException {

	public static void main(String[] args) {
		String chars = null;
		int num = 0;
		ThrowsExceptions te = new ThrowsExceptions();
		
			try{
			 System.out.print("Enter one of the following:\n1 for a number NumberFormatException, " +
					 "\n2 for an ArrayIndexOutOfBoundsException, \n3 for a NullPointerException " +
					 "or \n4 to print the stack trace:  ");
			 
			 Scanner scan = new Scanner(System.in);
			 chars = scan.next();
			 
			 num = Integer.parseInt(chars);
			 if(num < 1 || num > 4){
				 throw new MyCustomMenuException();
			 }
			}catch(MyCustomMenuException e){
				System.out.println(e.getMessage());
			}
			
			try{
				 switch(num){
					 case 1: 
						te.throwsNumberFormatException();
						break;
					 case 2:
						te.throwsArrayIndexOutOfBoundsException();
						break;
					 case 3:
						te.throwsNullPointerException();
						break;
					 case 4:
						te.printTheStackTrace();
						break;
				 }
			}catch(Exception e){
				System.out.println("The type of exception thrown was : "+e.getClass().getName()+" with the message : "+e.getMessage());
			}finally{
				System.out.println("Clean up in the finally method and say \"Bye!\"");
			}
	}
}


class ThrowsExceptions{
	
	public void throwsNumberFormatException() throws NumberFormatException{
		try{
			Integer.parseInt("a string");
		}catch(NumberFormatException e){
			throw new NumberFormatException("The string could not be parsed and converted to a number.  The exception message was \""+e+"\"");
		}
	}
	
	public void throwsArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException{
		String[] strings = {"one","two","three"};
		try{
			for(int i=0; i<=strings.length; i++){
				System.out.println("Array position "+i+" contains string value :  "+strings[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			throw new ArrayIndexOutOfBoundsException("The array bounds have been breached.  The exception message was \""+e+"\"");
		}
	}	

	public void throwsNullPointerException() throws NullPointerException{
		Ghost ghost = null;
		try{
				System.out.println(ghost.method());
		}catch(NullPointerException e){
			throw new NullPointerException("The string to be printed wasn't initialized.  The exception message was \""+e+"\"");
		}
	}	

	public void printTheStackTrace(){
		Ghost ghost = null;
		try{
				System.out.println(ghost.method());
		}catch(NullPointerException e){
			e.printStackTrace();
		}		
	}
}

class MyCustomMenuException extends Exception{
	
	MyCustomMenuException(){
		super("With the wrong input this program cannot function! Please enter a number from 1 to 4. ");
	}
}

class Ghost{
	public String method(){

		return "ghost method";
	}
}
