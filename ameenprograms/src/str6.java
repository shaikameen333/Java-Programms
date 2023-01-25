
public class str6 {
public static void main(String[] args) {
	String s1="I LIVE IN BANGALORE KARNATAKA";
	System.out.println(s1);
	System.out.println(); 
	
	String s2="";
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		if(ch=='A'||ch=='I') {
			String s3="";
			s3=s3+ch;
			s3=s3.toLowerCase();
			s2=s2+s3;
		}
		else {
			s2=s2+ch;
		}
	}
	System.out.println(s2);
			}
}
