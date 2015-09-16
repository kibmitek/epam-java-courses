package start;

import java.util.Arrays;

import homework.Sorting;

public class Hello {

	public static void main(String[] args) {
		Sorting sorting = new Sorting();
		System.out.println("Hello, java!!!");
		System.out.println();
		int[] arr = {4,2,9,0,2,1,65,5,8,6,76,7,3};
		
		System.out.println("Source array: "+ Arrays.toString(arr));
		System.out.println("Bubble-sorted array : "+ Arrays.toString(sorting.bubbleSort(arr.clone())));
		System.out.println();
		
		System.out.println("Source array: "+ Arrays.toString(arr));
		System.out.println("Silly-sorted  array : "+ Arrays.toString(sorting.sillySort(arr.clone())));
		System.out.println();
		
		System.out.println("Source array: "+ Arrays.toString(arr));
		System.out.println("Shaker-sorted array : "+ Arrays.toString(sorting.shakerSort(arr.clone())));
		System.out.println();
		
		System.out.println("Source array: "+ Arrays.toString(arr));
		System.out.println("EvenOdd-sorted array: "+ Arrays.toString(sorting.evenOddSort(arr.clone())));
		System.out.println();
	}

}
