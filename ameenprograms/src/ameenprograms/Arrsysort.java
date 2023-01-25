package ameenprograms;

import java.util.Arrays;

public class Arrsysort{

	public static void main(String[] args) {
		int a[]= {2,5,9,6,4};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {   //asscending order
			System.out.println(a[i]);
		}
		System.out.println("descending order");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}
