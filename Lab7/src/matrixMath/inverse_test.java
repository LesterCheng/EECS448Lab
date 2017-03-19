package matrixMath;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

;
public class inverse_test {

	@Test
	public void testInverse() {
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
				output[i][j] = test.inverse().getData()[i][j];
			}
		}
		
		//Create Matrix of expected values 
		double[][] expected = new double[n][n];
		expected[0][0] = 0.176;
		expected[0][1] = -0.003;
		expected[0][2] = -0.023;
		expected[1][0] = 0.059;
		expected[1][1] = -0.131;
		expected[1][2] = 0.085;
		expected[2][0] = -0.118;
		expected[2][1] = 0.150;
		expected[2][2] = 0.052;
		
		//Create a random number generator 
		Random rand = new Random(); 
		int randi = rand.nextInt(n); 
		int randj = rand.nextInt(n);
		
//		String out = String.format("Array: [%d, %d]", randi, randj); 
//		System.out.println(out);
		
		//Randomly select an index to be test 
		assertEquals(expected[randi][randj], output[randi][randj], 0.001);
	}

}
