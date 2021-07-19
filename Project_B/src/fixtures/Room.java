package fixtures;

import java.util.HashMap;

public class Room extends Fixtures{
	public String exits;
	public HashMap<String, Room> roomConnections = new HashMap<String, Room>();
	public Room(String name, String shortDescription, String longDescription, String exits) {
		super(name, shortDescription, longDescription);
		this.exits = exits;
	}
	
	
	public HashMap<String, Room> getExits()	{
		return roomConnections;
	}
	
	public Room getExit(String direction)	{
		return roomConnections.get(direction);
	}
	
	
}
