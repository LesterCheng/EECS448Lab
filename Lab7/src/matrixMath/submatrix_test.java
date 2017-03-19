package matrixMath;

import static org.junit.Assert.*;

import org.junit.Test;

public class submatrix_test {

	@Test
	public void testSubMatrix() {
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
		
		double[][] output = test.subMatrix(0, 0).getData();
		
		// Create expected matrices
		double[][] temp = new double[10][10];
		
		// submatrix(0,0)
		temp[0][0] = -2;
		temp[0][1] = 5;
		temp[1][0] = 8;
		temp[1][1] = 7;
		
		assertArrayEquals(temp, output);
		
		
	}

}
