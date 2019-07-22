package AdvancedInheritenceSpeak;

public class Dog extends Animal {
	
    public Dog () {

    	super("dog");
    }
    
	@Override
	public void speak() {

    	System.out.println("\"Bark!\"");
	}		

}
