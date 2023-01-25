package ameenprograms;

public class practice {
	public static void main(String[] args) {
		
		String name="malayalam";
		int count=0;
		char ch[]=new char[name.length()];
		
		for(int j=0;j<ch.length;j++) {
			char ch1=name.charAt(j);
			count++;
		}
		System.out.println(count);
	
	}
	

}
