package game;

public class Main {

	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		//rm.init();
		Player player = new Player(rm.rooms[0]);
		printRoom(player);

	}
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom.name);
	}
	
	private static String[] collectInput()	{
		return null;
		
	}
	
	private static void parse(String[] command, Player player)	{
		
	}

}
