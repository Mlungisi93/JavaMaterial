package dogInterface;

public class Dog extends Animal {
	
    public Dog () {

    	super("dog");
    }
    
	public Dog(String type){
		super(type);
	}	
	
	@Override
	public void speak() {

    	System.out.println("\"Bark!\"");
	}		

}
