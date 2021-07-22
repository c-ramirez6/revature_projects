package fixtures;

import java.util.HashMap;

public class Room extends Fixtures {
	public String exits;
	public HashMap<String, Room> roomConnections = new HashMap<String, Room>();
	public HashMap<String, Fixtures> items = new HashMap<String, Fixtures>();

	public Room(String name, String shortDescription, String longDescription, String exits) {
		super(name, shortDescription, longDescription);
		this.exits = exits;
	}

	public HashMap<String, Room> getExits() {
		return roomConnections;
	}

	public Room getExit(String direction) {
		return roomConnections.get(direction);
	}

	public void addItem(String name, String shortDescription, String longDescription) {
		items.put(name, new Item(name, shortDescription, longDescription));
	}

	public void populateExits(HashMap<String, Room> roomMap) {
		String[] exitInfo = exits.split(",");
		for (int i = 0; i < exitInfo.length - 1; i++) {
			roomConnections.put(exitInfo[i], roomMap.get(exitInfo[i + 1]));
			i++;
		}
	}

	@Override
	public String toString() {
		return "Room [name=" + this.name + ", roomConnections=" + roomConnections + ", items=" + items + "]";
	}
}
