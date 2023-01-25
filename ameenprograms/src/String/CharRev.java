package String;

public class CharRev {

	public static void main(String[] args) {
		String s1="java developer";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			if(s1.charAt(i)!=' ') {
				System.out.print(s1.charAt(i));
			}
			}
	
		}
			

	}


