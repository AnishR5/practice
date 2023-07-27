package Sorting;

public class Sort {
	
	public static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] arr)
	{System.out.print("Selection sort:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	public static void bubbleSort(int[] arr)
	{
		System.out.print("Bubble sort:");
		
		for(int i=0;i<arr.length;i++)
		{
			boolean swap=false;
			for(int j=0;j<arr.length-1-i;j++) //-i because for every iteration max num is getting placed at its right position, so to reduce efficiency -i is done
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(!swap)
				break;
		}
	}
	
	public static void insertionTechnique(int[] arr)
	{ //only last element is not sorted 
		int temp=arr[arr.length-1]; //last element
		int j;
		for(j=arr.length-2;j>=0 && arr[j]>temp ; j--)
		{
			arr[j+1]=arr[j];
		}
		arr[j+1]=temp;
	}
	
	public static void insertionSort(int[] arr)
	{	System.out.print("Insertion Sort:");
		//start with array for 2 elements and the further increase by one
		for(int i=1;i<arr.length;i++)
		{
			int temp=arr[i],j; //last element
			for(j=i-1;j>=0 && arr[j]>temp;j--)  //j start with second last element
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
	
	
	public static void heapSort(int[] arr)
	{
		//heap==> array implementation of complete or almost complete binary tree 
		//left child index=parent index*2
		//right child index=parent index*2 +1
		//parent index= child index/2
		//it is not bst its only tree , it can be bst
		//max heap ==> parent node > both child nodes   ==> to implement priority queue
		//min heap ==> parent node < both child nodes 
	}
	
	public static void mergeSort(int[] arr,int left,int right)
	{	//recursion terminantion condition
		if(left >=right )
			return;
		//divide array into two equal partitions
		int mid=(left+right)/2; 
		//sort left partition[left to mid]
		mergeSort(arr, left, mid);
		//sort right partition[mid+1 to right]
		mergeSort(arr, mid+1, right);
		//create temp arry 
		int[] temp=new int[right - left +1];
		//merge to sorted array
		int i=left,j=mid+1,k=0;
		//compare elements from both partitions and copy the smaller one (untill one partition is done)
		while(i<=mid && j<=right ) {
		if(arr[i]<arr[j])
			temp[k++]=arr[i++];
		else
			temp[k++]=arr[j++];}
		//copy remaining elements from other partitons  
		while(i<=mid)               // if right partiton over
			temp[k++]=arr[i++];
		while(j<=right)              // if left partiton over
			temp[k++]=arr[j++];
		//overWrite temp arr back to original array
		for(i=0;i<temp.length;i++)
		{
			arr[left+i]=temp[i];
		}
	}
	
	public static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void quickSort(int[] arr, int left,int right)
	{
		if(left>=right)
			return;
		int i=left,j=right;
		while(i<j)
		{
			while(i<=right && arr[i]<=arr[left])
				i++;
			while(arr[j]>arr[left])
				j--;
			if(i<j)
				swap(arr, i, j);
		}
		swap(arr, j, left);
		quickSort(arr, left, j-1);
		quickSort(arr, j+1, right);
	}

}
