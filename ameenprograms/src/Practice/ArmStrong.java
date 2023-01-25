package Practice;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		int temp1=temp;
		int arm=0;
		while (temp1!=0) {
			int ld=temp1%10;
			int fact=1;
			for(int i=1;i<=count;i++) {
				fact=fact*ld;
			}
			arm=arm+fact;
			temp1=temp1/10;
		}
		if(arm==temp) {
			System.out.println("Aram strong number");
		}
		else {
			System.out.println("Integer number");
		}
	}
}
