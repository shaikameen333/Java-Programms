
package ameenprograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string you want to check :");
		String s1=sc.nextLine();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			s2=ch+s2;
		}
		if (s2.equals(s1)) {
			System.out.println(" the string is  palindrome");
		}
		else {
			System.out.println("the string is not palindrome");
		}
	
		
		

	}

}
