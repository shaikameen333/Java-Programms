package ameenprograms;

import java.util.Scanner;

public class AA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		double a[]=new double[size];
		System.out.println("enter the double type of values");
		double pro=1;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextDouble();
			pro=pro*a[i];
		}
		
		System.out.println(pro);
				   	}
}

