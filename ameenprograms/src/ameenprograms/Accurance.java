package ameenprograms;

import java.util.Scanner;

public class Accurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String sen=sc.nextLine();
		int count[]=new int[128];
		for(int i=0;i<sen.length();i++) 
		{
			char ch=sen.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				count[ch]++;
			}
		}
		for(int i=0;i<128;i++) {
			if(count[i]!=0) {
				System.out.println((char)i +"  is"+ count [i] +" times present");
			}
		}


	}
}


