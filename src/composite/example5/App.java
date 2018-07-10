package composite.example5;

public class App {

	/**
	 * Program entry point
	 * @param args command line args
	 */
	public static void main(String[] args) {
		// Logger.info("Message from the orcs: ");

		LetterComposite orcMessage = new Messenger().messageFromOrcs();
		orcMessage.print();

		// LOGGER.info("\nMessage from the elves: ");

		LetterComposite elfMessage = new Messenger().messageFromElves();
		elfMessage.print();
	}

}
