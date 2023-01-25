package Try;

public class Wr2 {
public static void main(String[] args) {
	String s1="1A2B3C4";
	String s2="";
	int  sum=0;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
			s2=""+s1.charAt(i);
			sum=sum+Integer.parseInt(s2);
			
			
		}
	}

//	System.out.println(s2);
	System.out.println(sum);
//	System.out.println(Integer.parseInt(s2)+10);
	
}
}
