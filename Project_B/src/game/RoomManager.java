package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import fixtures.Room;

public class RoomManager {

	private static final int ROOM_EXITS = 3;
	private static final int LONG_DESCRIPTION = 2;
	private static final int SHORT_DESCRIPTION = 1;
	private static final int ROOM_NAME = 0;
	public Room[] rooms;
	public String[] roomData;
	public HashMap<String, Room> roomMap = new HashMap<String, Room>();
	public RoomManager()	{
		try {
		      File house = new File("HouseLayout.txt");
		      Scanner fileReader = new Scanner(house);
		      int houseSize = Integer.parseInt(fileReader.nextLine());
		      System.out.println(houseSize);
		      rooms = new Room[houseSize];
		      int i = 0;
		      while (fileReader.hasNextLine()) {
		        String roomInformation = fileReader.nextLine();
		        roomData = roomInformation.split(":");
		        rooms[i] = new Room(roomData[ROOM_NAME], roomData[SHORT_DESCRIPTION], roomData[LONG_DESCRIPTION], roomData[ROOM_EXITS]);
		        roomMap.put(rooms[i].name, rooms[i]);
		        System.out.println("Loading in " + rooms[i].name);
		        i++;
		      }
		      
		      for(Room room : rooms)	{
		    	  String[] exitInfo = room.exits.split(",");
		    	  for(int j = 0; j < exitInfo.length - 1; j++)	{
		    		  room.roomConnections.put(exitInfo[j], roomMap.get(exitInfo[j+1]));
		    		  j++;
		    	  }
		      }

		      for(Room x : rooms) {
		    	  System.out.println(x.name);
		    	  for(String y : x.getExits().keySet()) {
		    		  System.out.println(y + " " + x.getExits().get(y).name);
		    	  }
		    	  System.out.println();
		      }
		      
		      
		      fileReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
