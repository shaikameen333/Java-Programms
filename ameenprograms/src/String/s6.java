package String;

public class s6 {
	public static void main(String[] args) {
		String s1 = "HI HELLO UNCLE HOW ARE YOU DOING";
		String rev = "";
		String s2[] = s1.split(" ");
		for (int i = 0; i < s2.length; i++) {
			String var = s2[i];
			if (var.equals("UNCLE") || var.equals("YOU")) {
				
				rev = rev + reverse(var) + " ";
			} else {
				rev = rev + var + " ";
			}
		}
		System.out.println(rev);
	}

	public static String reverse(String s1) {
		String rev = "";
		for (int i = 0; i < s1.length(); i++) {
			rev = s1.charAt(i) + rev;
		}
		return rev;
	}
}
