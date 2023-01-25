package ameenprograms;

import java.util.Scanner;

public class Evenfrom1to100 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int s=sc.nextInt();
		
		
		for(int i=0;i<=s;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
