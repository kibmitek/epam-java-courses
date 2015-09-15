/**
 * 
 */
package start;

/**
 * @author Dmitrii_Semenov
 *
 */
public class Sorting {

	public int[] bubbleSort(int [] arr){
		int stepCounter = 0;
		int swapCounter = 0;
		for(int i=arr.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				stepCounter++;
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					swapCounter++;
				}
			}
		}
		System.out.println("Sorting complexity in steps = "+stepCounter);
		System.out.println("Sorting complexity in swaps = "+swapCounter);
		return arr;
	}
	
	private int[] swap(int[] arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr [j];
		arr[j] = tmp;
		return arr;
	}
	
	public int[] sillySort(int[] arr){
		int stepCounter = 0;
		int swapCounter = 0;
		int i=0;
		while(i<arr.length-1){
			stepCounter++;
				if(arr[i]>arr[i+1]){
					swap(arr,i,i+1);
					swapCounter++;
					i=0;
				}
				else
					i++;
		}
		System.out.println("Sorting complexity in steps = "+stepCounter);
		System.out.println("Sorting complexity in swaps = "+swapCounter);
		return arr;
	}
	
	public int [] shakerSort(int[] arr){
		int left = 0;
		int right = arr.length-1;
		int stepCounter = 0;
		int swapCounter = 0;
		while(left<right){
			for(int i=right;i>left;i--){
				stepCounter++;
				if(arr[i-1]>arr[i]){
					swap(arr,i-1,i);
					swapCounter++;
				}
			}
			left++;
			for(int i=left;i<right;i++){
				stepCounter++;
				if(arr[i]>arr[i+1]){
					swap(arr,i,i+1);
					swapCounter++;
				}
			}
			right--;
		}
		System.out.println("Sorting complexity in steps = "+stepCounter);
		System.out.println("Sorting complexity in swaps = "+swapCounter);
		return arr;
	}
	
	public int[] evenOddSort(int[] arr){
		int stepCounter = 0;
		int swapCounter = 0;
		for(int i=0;i<arr.length;i++){
			for(int j = (i % 2); j<arr.length-1; j+=2){
				stepCounter++;
				if(arr[j]>arr[j+1]){
					swap(arr, j,j+1);
					swapCounter++;
				}
			}
		}
	System.out.println("Sorting complexity in steps = "+stepCounter);
	System.out.println("Sorting complexity in swaps = "+swapCounter);
	return arr;
	}
}
