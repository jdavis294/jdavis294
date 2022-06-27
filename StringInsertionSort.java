package client.java;

public class StringInsertionSort {
	public static void main(String[]args) {
		
		String[]a= {"B","D","E","A","C"};
		System.out.print("Original Array: ");
		for(int x=0;x<a.length;x++) {
			System.out.print(a[x]+" ");
		}
		
		System.out.println();
		System.out.print("Insertion sort: ");
		insertionSort(a);
		for(int x =0 ; x<a.length;x++) {
			System.out.print(a[x]+ " ");
		}
	}



	public static void insertionSort(String[]a) {
		for(int i=0; i<a.length;i++) {
			int j = 1;
			while( j>=0 && a[j].compareTo(a[i])>0) {
				String temp = a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				j--;
				}
			}
		}
	}