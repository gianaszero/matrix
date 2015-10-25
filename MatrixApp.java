import java.util.Scanner;

class MatrixApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		

		System.out.print("Enter the size of your array:");
		int size = input.nextInt();


		Matrix A = new Matrix(size);
		Matrix B = new Matrix(size);

		Matrix C = new Matrix(size);

		for (int i = 0; i< size;i++) {
			for (int j =0; j< size;j++){
				System.out.print("Input element in your array A ["+i+"]"+"["+j+"] :");
				A.setCell(i, j, input.nextInt());
			}
		}

		System.out.println("Matrix A");
		A.displayMatrix();

		System.out.println();
		System.out.println();

		for (int h = 0; h< size;h++) {
			for (int k =0; k< size;k++){
				System.out.print("Input element in your array B["+h+"]"+"["+k+"] :");
				B.setCell(h, k, input.nextInt());
			}
		}

		System.out.println("Matrix B");
		B.displayMatrix();

		System.out.println();

		System.out.println("Matrix C is the sum of Matrix A and B");
		C.addMatrices(A, B);
		C.displayMatrix();
	}
}