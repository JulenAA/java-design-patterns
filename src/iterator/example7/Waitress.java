package iterator.example7;

public class Waitress {

	private BreadFastMenu breadFastMenu;
	private DinnerMenu dinnerMenu;

	public Waitress(BreadFastMenu breadFastMenu, DinnerMenu dinnerMenu) {
		this.breadFastMenu = breadFastMenu;
		this.dinnerMenu = dinnerMenu;
	}

	public void printMenu() {
		Iterator breadFastMenuIterator = breadFastMenu.createMenuIterator();
		while (breadFastMenuIterator.hasNext()) {
			print((Item) breadFastMenuIterator.next());
		}

		Iterator dinnerMenuIterator = dinnerMenu.createMenuIterator();
		while (dinnerMenuIterator.hasNext()) {
			print((Item) dinnerMenuIterator.next());
		}
	}

	/*
	 * public static void main(String[] args){ BreadFastMenu breadFastMenu = new
	 * BreadFastMenu(); DinnerMenu dinnerMenu = new DinnerMenu(); Iterator
	 * breadMenuIterator = breadFastMenu.createMenuIterator();
	 * while(breadMenuIterator.hasNext()){
	 * print((Item)breadMenuIterator.next()); } Iterator dinnerMenuIterator =
	 * dinnerMenu.createMenuIterator(); while (dinnerMenuIterator.hasNext()){
	 * print((Item)dinnerMenuIterator.next()); } }
	 */

	private static void print(Item item) {
		System.out.println(" name: " + item.getName() + ", des: "
				+ item.getDescription());
	}
}
