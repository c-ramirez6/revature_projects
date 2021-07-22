package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import fixtures.Room;

public class RoomManager {

	public ArrayList<Room> rooms = new ArrayList<>();
	public String[] roomData;
	public HashMap<String, Room> roomMap = new HashMap<String, Room>();

	public RoomManager() {

		try {
			File folder = new File("layout/");
			File[] listOfFiles = folder.listFiles();
			int i = 0;
			if(listOfFiles != null && listOfFiles.length > 0) {
				for(File file : listOfFiles) {
					Scanner fileReader = new Scanner(file);	
					addRoom(fileReader, i);
					while (fileReader.hasNextLine()) {
						addItem(fileReader, i);
				}
					i++;
					fileReader.close();
				}
				for (Room room : rooms) {
					room.populateExits(roomMap);
				}
				/*
				 * Used for debugging. Prints all of the rooms connected rooms
				 */
				for (Room x : rooms) {
					printLoadIn(x);
				}
			}
			else	{
				nullLayout();
			}

		}catch (FileNotFoundException e) {
		      System.out.println("Could not find layout folder or folder is empty");
		      e.printStackTrace();
		    }
	}

	private void printLoadIn(Room x) {
		System.out.println(x.name);
		for (String y : x.getExits().keySet()) {
			System.out.println(y + " " + x.getExits().get(y).name);
		}
		System.out.println();
	}
	
	private void addRoom(Scanner fileReader, int i)	{
		rooms.add(new Room(fileReader.nextLine(), fileReader.nextLine(), fileReader.nextLine(), fileReader.nextLine()));
		roomMap.put(rooms.get(i).name, rooms.get(i));
	}
	
	private void addItem(Scanner fileReader, int i) {
		rooms.get(i).addItem(fileReader.nextLine(), fileReader.nextLine(), fileReader.nextLine());
	}
	
	private void nullLayout()	{
		System.out.println("Could not find layout folder or folder is empty");
		System.out.println("Generating default room");
		rooms.add(new Room("n/a", "n/a", "n/a", "n/a"));
		roomMap.put("n/a", rooms.get(0));
	}
}
