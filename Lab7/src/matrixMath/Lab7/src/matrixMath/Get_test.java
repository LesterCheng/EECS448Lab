package matrixMath;

import static org.junit.Assert.*;

import org.junit.Test;

//Switched from JUnit 3 to JUnit 4
public class Get_test {

	@Test
	public void testGetN() {
		//Initialize value of n
		int n = 3;
		
		//Create new instance of Matrix
		Matrix test = new Matrix(n);
		
		//Call GetN() method and check value
		assertEquals(test.getN(), n);
	}

	@Test
	public void testGetData() {
		// Initialize values for new matrix
		int n = 3;
		double[][] input = new double[n][n];
		input[0][0] = 6;
		input[0][1] = 1;
		input[0][2] = 1;
		input[1][0] = 4;
		input[1][1] = -2;
		input[1][2] = 5;
		input[2][0] = 2;
		input[2][1] = 8;
		input[2][2] = 7;

		// Create new instance of Matrix
		Matrix test = new Matrix(n);

		// Fill Matrix test with values
		test.setData(input);

		// Create empty Matrix for getData() to fill
		double[][] output = new double[n][n];

		// Populate output[][] with values from test using getData()
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				output[i][j] = test.getData()[i][j];
			}
		}
		assertArrayEquals(input, output);
	}

}
