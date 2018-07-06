package delegate.example4;

public class RoarSound implements ISoundBehaviour {

	@Override
	public void makeSound() {
		System.out.println("Roar!");
	}

}
