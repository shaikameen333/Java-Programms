package ameenprograms;

public class CountofCapitalandSmall {

	public static void main(String[] args) {
		String s="ameenAMEEN";
		int Lcount1=0,Ucount2=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
				Lcount1++;
			else if (ch>='A'&&ch<='Z')
				Ucount2++;
		}
		System.out.println(Lcount1);
		System.out.println(Ucount2);
	}
}