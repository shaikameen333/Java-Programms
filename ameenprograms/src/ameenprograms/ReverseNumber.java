package ameenprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
        int temp=0;
        while(num>0) {
        	temp=num%10;
        	System.out.println(temp);
        	num=num/10;
        }
	}

}
