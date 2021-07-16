package game;

import fixtures.Room;

public class Player {
	public Room currentRoom;
	
	public Player(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public void moveRooms(String direction) {
		currentRoom = currentRoom.getExit(direction.toLowerCase());
	}
}
