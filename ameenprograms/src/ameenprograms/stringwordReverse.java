package ameenprograms;

public class stringwordReverse {

	public static void main(String[] args) {
		String s1="hello how are you";
		String s2="";
		String []st=s1.split(" ");//[hello,how,are,you]
		for(int i=0;i<st.length;i++) {
			String s=st[i];//Accessing element from array--->hello//how/are/you
			s2=s+" "+s2;//hello+" "+" "=hello//how+" "+hello=how hello//
		}
		System.out.println(s2);
	}

}
