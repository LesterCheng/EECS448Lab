package matrixMath;

import static org.junit.Assert.*;

import java.util.Arrays;

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

		// case1: submatrix(0,0)
		// Create expected matrices
		double[][] case1 = new double[n - 1][n - 1];
		case1[0][0] = -2;
		case1[0][1] = 5;
		case1[1][0] = 8;
		case1[1][1] = 7;
		// Actual values
		double[][] actual1 = test.subMatrix(0, 0).getData();

		// case2: submatrix(0,1)
		// Create expected matrices
		double[][] case2 = new double[n - 1][n - 1];
		case2[0][0] = 4;
		case2[0][1] = 5;
		case2[1][0] = 2;
		case2[1][1] = 7;
		// Actual values
		double[][] actual2 = test.subMatrix(0, 1).getData();

		// case3: submatrix(0,2)
		// Create expected matrices
		double[][] case3 = new double[n - 1][n - 1];
		case3[0][0] = 4;
		case3[0][1] = -2;
		case3[1][0] = 2;
		case3[1][1] = 8;
		// Actual values
		double[][] actual3 = test.subMatrix(0, 2).getData();

		// case4: submatrix(1,0)
		// Create expected matrices
		double[][] case4 = new double[n - 1][n - 1];
		case4[0][0] = 1;
		case4[0][1] = 1;
		case4[1][0] = 8;
		case4[1][1] = 7;
		// Actual values
		double[][] actual4 = test.subMatrix(1, 0).getData();

		// case5: submatrix(1,1)
		// Create expected matrices
		double[][] case5 = new double[n - 1][n - 1];
		case5[0][0] = 6;
		case5[0][1] = 1;
		case5[1][0] = 2;
		case5[1][1] = 7;
		// Actual values
		double[][] actual5 = test.subMatrix(1, 1).getData();

		// case6: submatrix(1,2)
		// Create expected matrices
		double[][] case6 = new double[n - 1][n - 1];
		case6[0][0] = 6;
		case6[0][1] = 1;
		case6[1][0] = 2;
		case6[1][1] = 8;
		// Actual values
		double[][] actual6 = test.subMatrix(1, 2).getData();

		// case7: submatrix(2,0)
		// Create expected matrices
		double[][] case7 = new double[n - 1][n - 1];
		case7[0][0] = 1;
		case7[0][1] = 1;
		case7[1][0] = -2;
		case7[1][1] = 5;
		// Actual values
		double[][] actual7 = test.subMatrix(2, 0).getData();

		// case8: submatrix(2,1)
		// Create expected matrices
		double[][] case8 = new double[n - 1][n - 1];
		case8[0][0] = 6;
		case8[0][1] = 1;
		case8[1][0] = 4;
		case8[1][1] = 5;
		// Actual values
		double[][] actual8 = test.subMatrix(2, 1).getData();

		// case9: submatrix(2,2)
		// Create expected matrices
		double[][] case9 = new double[n - 1][n - 1];
		case9[0][0] = 6;
		case9[0][1] = 1;
		case9[1][0] = 4;
		case9[1][1] = -2;
		// Actual values
		double[][] actual9 = test.subMatrix(2, 2).getData();

		// Compare expected and actual matrices
		boolean[] actualArr = new boolean[9];
		actualArr[0] = Arrays.deepEquals(case1, actual1);
		actualArr[1] = Arrays.deepEquals(case2, actual2);
		actualArr[2] = Arrays.deepEquals(case3, actual3);
		actualArr[3] = Arrays.deepEquals(case4, actual4);
		actualArr[4] = Arrays.deepEquals(case5, actual5);
		actualArr[5] = Arrays.deepEquals(case6, actual6);
		actualArr[6] = Arrays.deepEquals(case7, actual7);
		actualArr[7] = Arrays.deepEquals(case8, actual8);
		actualArr[8] = Arrays.deepEquals(case9, actual9);

		boolean testFlag = true;
		int caseCount = 1;
		for (boolean i : actualArr) {
			if (i == false) {
				testFlag = false;
				System.out.println("Error with case: " + caseCount);
			}
			caseCount++;
		}
		assertTrue(testFlag);
	}
}
