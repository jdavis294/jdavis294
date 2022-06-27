public class StringSelectionSort {
public static void main(String[]args) {
	String[]a= {"B","A","E","C","D"};
	System.out.print("Oringinal array of Strings: ");
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.print("After Sorting: ");
	selectionSort(a);
}
public static void Swap(String []a,int i,int j) {
	if(i!=j) {
		String temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}


public static void selectionSort(String[] a) {
	for(int i =0; i<a.length;i++) {
		int min = i;
		for( int j= i+1; j<a.length;j++) {
			if(a[j].compareTo(a[min])<0) {
				min=j;
				
			}
		}
		Swap(a,i,min);
		System.out.print(a[i]+" ");
	}
}
}
