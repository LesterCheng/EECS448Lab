package matrixMath;

import java.io.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//File io
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("input.txt"));
			
			String str;
			while((str = in.readLine()) != null) {
				Scanner numRead = new Scanner(str);
				System.out.println(numRead.nextDouble());
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
		for( double[] i : arr) {
			for( double j : i) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
	public static void printMatrix(int n, Matrix m) {
		System.out.println("M = ");
		printArr(m.getData());
		System.out.print("det(M) = " + m.determinant());
		System.out.println("Minv = ");
		printArr(m.inverse().getData());
		
	}

}
