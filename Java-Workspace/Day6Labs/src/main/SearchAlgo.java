package main;

public class SearchAlgo {

	public static void main(String[] args) {
		SearchAlgo search = new SearchAlgo();
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 
				'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		System.out.println(search.indexOf('g', letters));
		
		
	}
	
	public int indexOf(char target, char[] data) {
		if(data == null) return -1;
		
		int result = -1;
		
		for(int i = 0; i < data.length; i++) {
			if(target == data[i])	{
				return i;
			}
		}
		
		return result;
	}

}
