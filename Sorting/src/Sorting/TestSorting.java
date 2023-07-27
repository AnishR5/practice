package Sorting;
import static Sorting.Sort.*;

public class TestSorting {

	public static void main(String[] args) {
		int[] arr= {5,62,8,61,1,995,23};
		
		printArr(arr);
//		selectionSort(arr);
//		printArr(arr);	
//		bubbleSort(arr);
//		printArr(arr);
//		insertionSort(arr);
//		printArr(arr);
		mergeSort(arr, 0, arr.length-1);
		printArr(arr);
	}

}
