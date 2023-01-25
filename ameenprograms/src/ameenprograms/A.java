package ameenprograms;

import java.util.HashSet;

public class A {
	public static void main(String[] args) {
		String sentence="i have 200 apples";
		String[] spliting = sentence.split(" ");
		String rev="";
		for(String var:spliting) {
			if(var.equals("200")){
				for(int i=0;i<var.length();i++) {
					rev=var.charAt(i)+rev;
				}
				System.out.println(rev+" ");
			}
			else {
				System.out.println(var+" ");
			}
		}
	}

}










