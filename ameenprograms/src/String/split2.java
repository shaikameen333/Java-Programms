package String;

public class split2 {

	public static void main(String[] args) {
	    String s1="hi bye cya hi bye cya bye hi";
	    System.out.println(s1);
	    String s3="";
	    String s2[]=s1.split(" ");
	  for(int i=0;i<s2.length;i++) {
		  String var=s2[i];
		  if(var.equals("hi")) {
			  s3=s3+"bye"+" ";
		  }
		  else {
			  s3=s3+" "+var+" ";
		  }
	  }
	 System.out.println(s3);
	}
	   	}


