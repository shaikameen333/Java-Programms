package String;

public class s1 {
	public static void main(String[] args) {
		String s1 = "Rammanna is my name";
		String s2[] = s1.split(" ");
		String max = s2[0];
		int count = s2[0].length();
		for (int i = 0; i < s2.length; i++) {
			String var = s2[i];
			if (var.length() > count) {
				max = var;
				count = var.length();
			}

		}

		System.out.println(max);

	}

}
