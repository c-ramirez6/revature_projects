package game;

import java.util.Stack;

import fixtures.Room;

public class Player {
	public Room currentRoom;
	private Stack<Room> roomOrder = new Stack<>();
	
	public Player(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public void moveRooms(String direction) {
		currentRoom = currentRoom.getExit(direction.toLowerCase());
	}
	
	public void updateRoomOrder(Room room)	{
		roomOrder.push(room);
	}
	
	public Stack<Room> getRoomOrder(){
		return roomOrder;
	}
}
