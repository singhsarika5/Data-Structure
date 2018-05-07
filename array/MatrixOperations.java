package array;

public class MatrixOperations {
	
	public int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
		 if(matrix1 == null || matrix1 == null) {
			 throw new IllegalArgumentException("Enter valid matrix");
		 }
		 if(matrix1.length == 0 || matrix2.length == 0) {
			 throw new IllegalArgumentException();
		 }
		 
		 int[][] matrix3 = new int[matrix1.length][matrix2[0].length];
		 for(int i = 0; i < matrix1.length ; i++) {
			 for(int j = 0; j < matrix2[0].length; j++) {
				 matrix3[i][j] = 0;
				 for(int k = 0; k < matrix1[0].length; k++)
				 {
					 matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
				 }
			 }
		 }
		 return matrix3;
	}

	
	public void displayMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MatrixOperations obj = new MatrixOperations();
		int[][] matrix1 ={{1,4}};
		int[][] matrix2 = {{3},{4}};
		
		int[][] matrix3 = obj.multiplyMatrix(matrix1, matrix2);
		
		obj.displayMatrix(matrix3);
	}
}
