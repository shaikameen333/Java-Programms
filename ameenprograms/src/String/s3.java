package String;

public class s3 {
	public static void main(String[] args) {
		String s1 = "RAJA";
		int count[] = new int[128];//
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);//R
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				count[ch]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println((char) i + ": is " + count[i] + "   times present");
			}
		}

	}

}
