package matrixMath;

import static org.junit.Assert.*;

import org.junit.Test;

public class determinant_test {

	@Test
	public void testDeterminantSize1() { // Test case for n=1
		// Initialize value of n
		int n = 1;

		// Create new instance of Matrix
		Matrix test = new Matrix(n);

		// Fill matrix with values
		double[][] input = new double[n][n];
		input[0][0] = 1;
		test.setData(input);

		assertEquals(1.0, test.determinant(), 0);
	}

	@Test
	public void testDeterminantSize2() { // Test case for n=2
		// Initialize value of n
		int n = 2;

		// Create new instance of Matrix
		Matrix test = new Matrix(n);

		// Fill matrix with values
		double[][] input = new double[n][n];
		input[0][0] = 3;
		input[0][1] = 8;
		input[1][0] = 4;
		input[1][1] = 6;
		test.setData(input);

		assertEquals(-14.0, test.determinant(), 0);
	}

	@Test
	public void testDeterminant() { // Test case for n>2
		// Initialize value of n
		int n = 3;

		// Create new instance of Matrix
		Matrix test = new Matrix(n);

		// Fill matrix with values
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

		test.setData(input);

		assertEquals(-306.0, test.determinant(), 0);
	}

}
