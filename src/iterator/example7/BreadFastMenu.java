package iterator.example7;

public class BreadFastMenu implements Menu {
	private Item[] items;

	private int currentPosition;

	private static int DINNER_LENGTH = 6;

	public BreadFastMenu() {
		items = new Item[DINNER_LENGTH];
		addItem("Fish", "spicy fish");
		addItem("chicken", "delicious chick");
	}

	private void addItem(String name, String des) {
		Item item = new Item(name, des);
		if (currentPosition >= DINNER_LENGTH) {
			System.out.println("dinner is full...");
		} else {
			items[currentPosition] = item;
			currentPosition++;
		}
	}

	public Iterator createMenuIterator() {
		return new BreadfastMenuIterator(items);
	}
}
