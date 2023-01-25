package ameenprograms;

public class RemoveDuplicatesWithoutCollections {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,4,4,5,5,6};
		int a[]=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				a[k++]=arr[i];
			}
		}
		a[k]=arr[arr.length-1];
		for(int i=0;i<=k;i++) {
			System.out.println(a[i]);
		}
		
	 }
}


