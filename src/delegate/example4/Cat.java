package delegate.example4;

public class Cat {
	
	private ISoundBehaviour sound = new MeowSound();
	
	public void makeSound(){
		this.sound.makeSound();
	}

	public void setSoundBehaviour(ISoundBehaviour sound) {
		this.sound = sound;
	}
}
