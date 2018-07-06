package delegate.example4;

public class Main {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		
		//Delegation
		c.makeSound();	//Output: Meow
		
		// now to change the sound it makes
		ISoundBehaviour newSound = new RoarSound();
		c.setSoundBehaviour(newSound);
		
		// Delegation
		c.makeSound();	//Output: Roar!

	}

}
