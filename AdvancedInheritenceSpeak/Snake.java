package AdvancedInheritenceSpeak;

public class Snake extends Animal {
	
    public Snake () {
    	super("snake");
    }
    
	
	@Override
	public void speak() {
		System.out.println("\"Hiss!\"");
	}		

}
