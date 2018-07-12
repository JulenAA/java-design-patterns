package iterator.example7;

import java.util.List;

public class DinnerMenuIterator implements Iterator {

	private List<Item> items;
	private int currentPosition;

	public DinnerMenuIterator(List<Item> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return !(currentPosition >= items.size() || items.get(currentPosition) == null);
	}

	@Override
	public Object next() {
		Item item = items.get(currentPosition);
		currentPosition++;
		return item;
	}

}
