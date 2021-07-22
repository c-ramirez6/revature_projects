package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import fixtures.Room;

public class RoomManager {

	public ArrayList<Room> rooms = new ArrayList<>();
	public HashMap<String, Room> roomMap = new HashMap<String, Room>();

	public RoomManager() {

		try {
			/*
			 * Reads in layout folder and makes an array of files containing 
			 * all of the files in the layout folder
			 */
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

	
	/*
	 * Prints the room and all of the connected rooms
	 */
	private void printLoadIn(Room x) {
		System.out.println(x.name);
		for (String y : x.getExits().keySet()) {
			System.out.println(y + " " + x.getExits().get(y).name);
		}
		System.out.println();
	}
	
	/*
	 * Adds room to room map and room array list
	 */
	private void addRoom(Scanner fileReader, int i)	{
		rooms.add(new Room(fileReader.nextLine(), fileReader.nextLine(), fileReader.nextLine(), fileReader.nextLine()));
		roomMap.put(rooms.get(i).name, rooms.get(i));
	}
	
	/*
	 * Adds an item to rooms item map
	 */
	private void addItem(Scanner fileReader, int i) {
		rooms.get(i).addItem(fileReader.nextLine(), fileReader.nextLine(), fileReader.nextLine(), fileReader.nextLine());
	}
	
	/*
	 * Creates a room in case there is no files found
	 */
	private void nullLayout()	{
		System.out.println("Could not find layout folder or folder is empty");
		System.out.println("Generating default room");
		rooms.add(new Room("n/a", "n/a", "n/a", "n/a"));
		roomMap.put("n/a", rooms.get(0));
	}
}
