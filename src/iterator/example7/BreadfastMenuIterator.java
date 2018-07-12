package iterator.example7;

public class BreadfastMenuIterator implements Iterator {

	private Item[] items;
	private int position;

	public BreadfastMenuIterator(Item[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return !(position >= items.length || items[position] == null);
	}

	@Override
	public Object next() {
		Item item = items[position];
		position++;
		return item;
	}

}
