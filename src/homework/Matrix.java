/**
 * 
 */
package homework;


/**
 * @author Dmitrii_Semenov
 *
 */
public class Matrix {
	public static void main(String[] args) {
		int[][] matrix = new int[30][20];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if((i % (matrix[i].length) == j)			//main diagonal and below
						||((i+j+1)%matrix[i].length == 0)	//reflection and below
						){
					matrix[i][j]=1;
				}
			}
		}
		printMatrix(matrix, "1 ", "  ");
	}
	
	private static void printMatrix(int[][] matrix, String label1, String label0){
		for (int i = 0; i < matrix.length; i++) {
			int zerocounter = 0;
			OUTER:
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == 1){
					System.out.print(label1);
					continue OUTER;//comment this block to get mistake in zeroes counting
				}
				else{
					System.out.print(label0);
				}
				zerocounter++;
				
			}
			System.out.println("    count of zeroes in vector: " + zerocounter);
		}
		
	}
}
