package String;


import java.util.Scanner;

public class stringreverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sting");
		String s1=sc.next();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			s2=ch+s2;
		}
		if(s1.equals(s2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		 
	}
}
