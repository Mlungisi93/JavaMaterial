package AdvancedInheritenceSpeak;

public class UseAnimals {
	
    public static void main (String[] args) {
		
		Animal[] animals = {new Cow(), new Dog(), new Snake()};

		
		for(int i=0; i<animals.length; i++){
			String className = animals[i].getClass().getName();
			System.out.print("When the "+className+" speaks it says ");
			animals[i].speak();
		}
    }
}
