package String;

public class split {
public static void main(String[] args) {
	String s1="I LIVE IN BANGALORE KARNATAKA";
	String s2[]=s1.split(" ");
	int count=0;
	String rev=" ";
	for(int i=0;i<s2.length;i++) {
		rev=s2[i]+" "+rev;
		count++;
	}
	System.out.println(rev);
	System.out.println(count);
}
}
