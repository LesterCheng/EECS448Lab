package matrixMath;

import java.io.*;
import java.util.Scanner;

public class main {
	// Accumulator string
	static String output = "";

	public static void main(String[] args) {

		// File io
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("input.txt"));
			String str;
			while ((str = in.readLine()) != null) {
				// Read in matrix
				// Get size of array
				int n = Integer.parseInt(str);
				if (n != 0) {
					double[][] input = new double[n][n];
					int i = 0;
					// Read line
					while (i < n) {
						str = in.readLine();
						// Read number in line
						Scanner numRead = new Scanner(str);
						int j = 0;
						while (numRead.hasNext()) {
							// Store input matrix in an array
							input[i][j] = numRead.nextDouble();
							j++;
						}
						i++;
						numRead.close();
					}
					// Create matrix object an pass in data from array
					Matrix m = new Matrix(n);
					m.setData(input);
					printMatrix(n, m);
				}
			}
			try {
				// Set System.out to output to text file
				System.setOut(new PrintStream(new File("output.txt")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			// Print accumulated string
			System.out.println(output + "Done!");

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to read file");
			e.printStackTrace();
		}
	}

	// Build output string

	// Function to print contents of an input array
	public static void printArr(double[][] arr, boolean castInt) {
		if (castInt) {
			for (double[] i : arr) {
				for (double j : i) {
					output = output + ((int) j + " ");
				}
				output = output + "\n";
			}
		} else {
			for (double[] i : arr) {
				for (double j : i) {
					// Cast double to int if number is an int
					if ((j == Math.floor(j))) {
						output = output + ((int) j + " ");
					} else {
						output = output + (j + " ");
					}
				}
				output = output + "\n";
			}
		}
	}

	// Function to run calculations on matrix and print results
	public static void printMatrix(int n, Matrix m) {
		double det = m.determinant();
		output = output + "M = \n";
		printArr(m.getData(), true);
		output = output + "det(M) = " + det;
		if (det != 0) { // Check if determinant is 0
			output = output + "\nMinv = \n";
			printArr(m.inverse().getData(), false);
		}
	}
}
