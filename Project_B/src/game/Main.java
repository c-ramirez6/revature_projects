package game;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static final int NOUN = 1;
	private static final int COMMAND = 0;
	final static List<String> MOVE_COMMANDS = List.of("move", "go", "walk");
	final static List<String> OBSERVATION_COMMANDS = List.of("look at", "look", "examine");

	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		Scanner sc = new Scanner(System.in);
		String[] command = null;
		Player player = new Player(rm.rooms[0]);
		System.out.println("Type help for list of commands as well as how to format commands");
		do	{
			
			printRoom(player);
			command = collectInput(sc);
			parse(command, player);
		}while(command[0].compareToIgnoreCase("quit") != 0);
		
	}
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom.name);
		System.out.println(player.currentRoom.shortDescription + "\n\n");
	}
	
	private static String[] collectInput(Scanner sc)	{
		return sc.nextLine().split(":");	
	}
	
	private static void parse(String[] command, Player player)	{
		if(MOVE_COMMANDS.contains(command[COMMAND].toLowerCase()))	{
			player.moveRooms(command[NOUN]);
			System.out.println("You moved to the " + player.currentRoom.name + "\n");
		}
		else if(command[COMMAND].equalsIgnoreCase("help"))	{
			displayHelp();
		}
		else if(OBSERVATION_COMMANDS.contains(command[COMMAND].toLowerCase()))	{
			System.out.println("\n\n" + player.currentRoom.longDescription + "\n\n");
		}
	}
	
	private static void displayHelp()	{
		System.out.println("Accepted command format is as follows");
		System.out.println("<Command>:<Noun>\n");
		System.out.println("Examples: \n");
		System.out.println("Go:north");
		System.out.println("walk:south east");
		System.out.println("Accepted Commands:\n");
		System.out.println("Movement Commands:\n");
		for(String x : MOVE_COMMANDS) {
			System.out.println(x);
		}
		System.out.println("\nObservation Commands:\n");
		for(String x : OBSERVATION_COMMANDS) {
			System.out.println(x);
		}
		System.out.println("\n\n");
	}

}
