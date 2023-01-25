package ameenprograms;

import java.util.HashSet;

public class RemoveDuplicatesFromAArray {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,4,4,5,5,6,6};
		HashSet h1=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			h1.add(arr[i]);
		}
		System.out.println(h1);
		

	}
}
