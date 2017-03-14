package matrixMath;

public class main {

	public static void main(String[] args) {
		int n = 4;
		double input[][] = new double[n][n];
		int counter = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				input[i][j] = counter;
				counter++;
			}
		}
		Matrix test = new Matrix(n);
		test.setData(input);
		System.out.println("Array: ");
		printArr(test.getData());
		System.out.println("Determinant: " + test.determinant());
		

	}
	
	//Function to print contents of an input array
	public static void printArr(double[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}


}

