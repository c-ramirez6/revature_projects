package game;

import java.util.List;
import java.util.Scanner;

import exceptions.FixtureDoesNotExistException;

public class Main {
	
	private static final int NOUN = 1;
	private static final int COMMAND = 0;
	final static List<String> MOVE_COMMANDS = List.of("move", "go", "walk", "move to");
	final static List<String> OBSERVATION_COMMANDS = List.of("look at", "look", "examine");
	private static final String STARTING_ROOM = "The Foyer";

	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		Scanner sc = new Scanner(System.in);
		String[] command = null;
		Player player;
		if(rm.roomMap.containsKey("n/a"))	{
			player = new Player(rm.roomMap.get("n/a"));
		}
		else	{
			player = new Player(rm.roomMap.get(STARTING_ROOM));
		}
		System.out.println("Type help for list of commands as well as how to format commands");
		System.out.println("Will perform better if you pay attention to case sensitivity");
		do	{
			printRoom(player);
			command = collectInput(sc);
			try {
				parse(command, player);
			} catch (FixtureDoesNotExistException e) {
				System.out.println(e.getMessage());
			}
		}while(command[COMMAND].compareToIgnoreCase("quit") != 0);
		System.out.println("Thanks for playing!");
	}
	
	private static void printRoom(Player player) {
		System.out.println("Current room: " + player.currentRoom.name);
		System.out.println(player.currentRoom.shortDescription);
		System.out.println("You can see: \n");
		for(String x : player.currentRoom.items.keySet()) {
			System.out.println(x + ": " + player.currentRoom.items.get(x).shortDescription);
		}
	}
	
	private static String[] collectInput(Scanner sc)	{
		return sc.nextLine().split(":");	
	}
	
	private static void parse(String[] command, Player player) throws FixtureDoesNotExistException	{
		if(MOVE_COMMANDS.contains(command[COMMAND].toLowerCase()))	{
			player.updateRoomOrder(player.currentRoom);
			player.moveRooms(command[NOUN]);
			if(player.currentRoom != null) {
				System.out.println("You moved to the " + player.currentRoom.name + "\n");
			}
			else	{
				player.currentRoom = player.getRoomOrder().pop();
				throw new FixtureDoesNotExistException("Room does not exist");
			}
		}
		else if(command[COMMAND].equalsIgnoreCase("help"))	{
			displayHelp();
		}
		else if(OBSERVATION_COMMANDS.contains(command[COMMAND].toLowerCase()))	{
			if(command.length == 1 || command[NOUN].equalsIgnoreCase("room") || command[NOUN].equalsIgnoreCase(player.currentRoom.name))	{
				System.out.println("\n" + player.currentRoom.longDescription + "\n");
			}
			else if(player.currentRoom.items.get(command[NOUN]) != null)	{
				System.out.println("\n" + player.currentRoom.items.get(command[NOUN]).name + ": " 
			+ player.currentRoom.items.get(command[NOUN]).longDescription + "\n");
			}
			else	{
				throw new FixtureDoesNotExistException("Item does not exist");
			}
		}
		else if(command[COMMAND].equalsIgnoreCase("back"))	{
			try	{
				player.currentRoom = player.getRoomOrder().pop();
			}	catch(java.util.EmptyStackException e) {
				System.out.println("You are at the first room.  Can not go back any farther");
			}
		}
	}
	
	private static void displayHelp()	{
		System.out.println("Accepted command format is as follows");
		System.out.println("<Command>:<Noun>");
		System.out.println("When there is a target");
		System.out.println("Examples: \n");
		System.out.println("Go:north");
		System.out.println("walk:south east");
		System.out.println("look at:Desk");
		System.out.println("look:room");
		System.out.println("Accepted Commands:");
		System.out.println("Movement Commands:\n");
		for(String x : MOVE_COMMANDS) {
			System.out.println(x);
		}
		System.out.println("\nObservation Commands:\n");
		for(String x : OBSERVATION_COMMANDS) {
			System.out.println(x);
		}
		System.out.println("\n");
	}

}
