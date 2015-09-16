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
		boolean isPrintZeroes = true;						//change it into false if you hate zeroes
		for (int i = 0; i < matrix.length; i++) {
			int zerocounter = 0;
			OUTER:
			for (int j = 0; j < matrix[i].length; j++) {
				if((i % (matrix[i].length) == j)			//main diagonal and below
						||((i+j+1)%matrix[i].length == 0)	//reflection and below
						){
					matrix[i][j]=1;
					System.out.print(matrix[i][j]+ " ");
//					break OUTER; // use 'break' instead of 'continue' to see some different digital painting
					continue OUTER;
				}
				else {
					if(isPrintZeroes){
						System.out.print("0 ");
					}
					else{
						System.out.print("  ");
					}
				}
				zerocounter++;
			}
		System.out.println("    count of zeroes in line: " + zerocounter);	
		}
	}
}
