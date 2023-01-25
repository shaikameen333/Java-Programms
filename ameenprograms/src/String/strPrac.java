package String;

public class strPrac {

	public static void main(String[] args)    {
		String s1="ABCDEF";
		System.out.println(s1);
		char ch[]=s1.toCharArray();
		String rev="";
	    for(int i=s1.length()-1;i>=0;i--) {
	    	rev=rev+ch[i];
	}
	    System.out.println(rev);
	   
}
}