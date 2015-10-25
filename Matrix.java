
class Matrix {

	private final int SIZE;

	private int[][] matrix;

	public Matrix(int size){
		matrix = new int[size][size];

		SIZE = size;
	}

	public void addMatrices(Matrix A, Matrix B){
		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {
				matrix[x][y] = A.getCell(x, y) + B.getCell(x, y);
			}
		}
	}

	public void setCell(int x, int y, int value) {
		matrix[x][y] = value;
	}


	public int getCell(int x, int y) {
		return matrix[x][y];
	}


	public void displayMatrix() {
		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {
				System.out.print(matrix[x][y] + "\t");
			}
			System.out.println();
		}
	}
}