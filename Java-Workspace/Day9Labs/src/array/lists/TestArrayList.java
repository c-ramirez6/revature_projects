package array.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<Item> items = new ArrayList<Item>();
		
		items.add(new Item(1, "This is item 1"));
		items.add(new Item(2, "This is item 2"));
		items.add(new Item(3, "This is item 3"));
		items.add(new Item(4, "This is item 4"));
		items.add(new Item(5, "This is item 5"));
		
		System.out.println(items.get(2));
		
		Item removed = items.remove(items.size()-1);
		System.out.println(removed);
		
		Iterator<Item> iter = items.iterator();
		
		while(iter.hasNext())	{
			Item item = iter.next();
			System.out.println("Removeing item: " + item);
			iter.remove();
			items.add(new Item(6, "THis is item 6"));
		}
		
		System.out.println(items.size());

	}

}
