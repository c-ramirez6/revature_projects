package fixtures;

import java.util.HashMap;

public class Room extends Fixtures{
	final static int NORTH = 0;
	final static int SOUTH = 1;
	final static int EAST = 2;
	final static int WEST = 3;
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
