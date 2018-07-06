package delegate.example4;

public class MeowSound implements ISoundBehaviour {

	@Override
	public void makeSound() {
		System.out.println("Meow");
	}

}
