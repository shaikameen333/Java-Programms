package ameenprograms;

import java.util.Arrays;

public class arrayMinandMax {

	public static void main(String[] args) {
	
		int a[]= {2,5,9,6,4};
		int n=a.length;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {   //asscending order
			System.out.println(a[i]);
		}

		
		System.out.println("min= "+a[0]);
		System.out.println("max = "+a[n-1]);
	}

}
