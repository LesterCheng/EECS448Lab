package matrixMath;

import java.io.*;

public class main {

	public static void main(String[] args) {
		
		//File io
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("input.txt"));
			String str;
			
			//Read first line to find matrix size n.
			int n = Integer.parseInt(in.readLine());
			
			//Create array to hold n size matrix.
			String[] list = new String[n];
			int lineCount = 0;
			//TODO: Rewrite recursively to take in any number of arrays
			//Take in n size matrix
			while((str = in.readLine()) != null && lineCount < n){
				list[lineCount] = str;
			    lineCount++;
			}
			
			//Print out input contents
			for( String i : list) {
				System.out.println(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to read file");
			e.printStackTrace();
		}
		
	}

	// Function to print contents of an input array
	public static void printArr(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
