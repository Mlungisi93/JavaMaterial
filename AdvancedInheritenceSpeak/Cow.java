package AdvancedInheritenceSpeak;

public class Cow extends Animal{
		private boolean bell;
		
		public Cow() {
			super("cow");
		}

		@Override
		public void speak() {

			System.out.println("\"Moo!\"");
		}		
}
