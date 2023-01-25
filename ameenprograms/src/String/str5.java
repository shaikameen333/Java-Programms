package String;

public class str5 {

	public static void main(String[] args) {
  String s1="apple mango";
  System.out.println(s1);
  String s2="";
    for(int i=0;i<s1.length();i++) {
    	 char ch=s1.charAt(i);
    	 if(ch=='a') {
    		 String s3="";
    		 s3=s3+ch;
    		 s3=s3.toUpperCase();  
    		 s2=s2+s3;
    		 
    	
    	 }
    	 else {
    		 s2=s2+ch;
    	 }
    	
    }
    System.out.println(s2);
	}

}
