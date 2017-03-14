package matrixMath;

public class Matrix {
	
	private final int MaxSize = 10;
	private int n = 0;
	private double mdata[][] = new double[MaxSize][MaxSize];
	
	
	//Constructor
	public Matrix() {
	}
	
	//Single parameter constructor for matrix size n
	public Matrix(int size) {
		setN(size);
	}
	//Get/Set
	public void setN(int inN) {
		n = inN;
	}
	
	public int getN() {
		return n;
	}
	
	public void setData(double in[][]) {
		//copy values from input array into mdata
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				mdata[i][j] = in[i][j];
			}
		}
	}
	
	public double[][] getData() {
		return mdata;
	}
	
	//Methods
	double determinant() {
		double det = 0.0;

		if (n == 1)
		{
			det = mdata[0][0];
		}
		else if (n == 2)
		{
			det = mdata[0][0] * mdata[1][1] - mdata[0][1] * mdata[1][0];
		}
		else
		{
			for (int i = 0; i < n; ++i)
			{
				det += Math.pow(-1.0, (double)i) * mdata[0][i] * subMatrix(0, i).determinant();
			}
		}
		
		return det;
	}
	
	Matrix inverse() {
		Matrix inv = new Matrix(n);
		double det = determinant();
		
		for (int i = 0; i < n; ++i)
		{
			for (int j = 0; j < n; ++j)
			{
				inv.mdata[i][j] = Math.pow(-1.0, (double)i + j) * subMatrix(j, i).determinant() / det;
			}
		}
		
		return inv;
	}
	
	Matrix subMatrix(int r, int c) {
		Matrix sub = new Matrix(n-1);
	
		int row = 0; 
		for (int i = 0; i < n; ++i)
		{
			if (i == r) continue;
			
			int col = 0;
			for (int j = 0; j < n; ++j)
			{
				if (j == c) continue;
				
				sub.mdata[row][col] = mdata[i][j];
				++col;
			}
			
			++row;
		}
		
		return sub;
	}
}