package String;

public class str3 {

	public static void main(String[] args) {
	String s1="JAVA DEVELOPER";
	String s2="";
	String rev="";
	s2=s1.substring(2, 10);
	System.out.println(s2);
	for(int i=s2.length()-1;i>=0;i--) {
	  rev=rev+s2.charAt(i);
	 
	  
	}
	System.out.println(rev);

	}

}
