package String;

public class s2 {
	public static void main(String[] args) {
		String s1 = "my name is yash";
		System.out.println(s1);
		String s2[] = s1.split(" ");
		String s3 = "";
		for (int i = 0; i < s2.length; i++) {
			if (s2[i].startsWith("y")) {
				s2[i] = s2[i].toUpperCase();
				s3 = s3 + s2[i] + " ";
			} else {
				s3 = s3 + s2[i] + " ";
			}
		}
		System.out.println(s3);
	}

}
