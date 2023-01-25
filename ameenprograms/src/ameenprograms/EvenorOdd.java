package ameenprograms;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
   /*  Scanner s=new Scanner(System.in);
     System.out.println("enter the number");
     int a=s.nextInt();
     if(a%2==0) {
    	 System.out.println("it is a even number");
     }
     else {
    	 System.out.println("it is a odd number");
     }
	}
*/
	int sum=0;
	for(int i=10;i<=50;i++) {
		if(i%2==1) {
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
}
