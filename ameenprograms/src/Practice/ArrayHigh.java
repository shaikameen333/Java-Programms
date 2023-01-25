package Practice;

import java.util.Scanner;

public class ArrayHigh {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
