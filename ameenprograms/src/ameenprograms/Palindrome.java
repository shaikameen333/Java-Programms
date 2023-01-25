
package ameenprograms;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int a=sc.nextInt();
		int b=a;
		int rem=0;
		while(a!=0) {
			int num=a%10;
			rem=rem*10+num;
			a=a/10;
		}
		if(rem==b) {
			System.out.println(b+" palindrome");
		}
		else {
			System.out.println(b+" not palindrome");
		}
	}
}
