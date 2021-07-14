package main;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		int[][][] array = new int[3][3][3];

		array[0][0][0] = 1;
		System.out.println(array[0][0][0]);
		
		int[][] my2dArray = {{1,2,0}, {4,5,6}, {1,4,5}};
		
		System.out.println(my2dArray.length);
		
		System.out.println(my2dArray[1][2]);
	}

}
