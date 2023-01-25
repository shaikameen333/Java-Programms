package String;

public class takechar {

	public static void main(String[] args) {
		String s1="java Ameena";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='A') {
				count++;
			}
		}
		System.out.println(count);

	}

}
