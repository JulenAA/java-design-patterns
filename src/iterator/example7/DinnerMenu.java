package iterator.example7;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu implements Menu {
	
	private List<Item> dinnerItems;

	public DinnerMenu() {
		dinnerItems = new ArrayList<Item>();
		addItem("bread", "sweet bread");
	}

	private void addItem(String name, String des) {
		Item item = new Item(name, des);
		dinnerItems.add(item);
	}

	public Iterator createMenuIterator() {
		return new DinnerMenuIterator(dinnerItems);
	}
}
