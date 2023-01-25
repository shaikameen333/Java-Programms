package String;

public class strnumre {
public static void main(String[] args) {
	String s1="Ameen1996";
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)>='0'&&s1.charAt(i)<='9') {
			System.out.println(s1.charAt(i));
		}
	}
}
}
