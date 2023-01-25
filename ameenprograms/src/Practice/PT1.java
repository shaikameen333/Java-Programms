package Practice;

public class PT1 {
	public static void main(String[] args) {
		int num=121;
        int num1=num;
        int rem=0;
        while(num!=0) {
        	int ld=num%10;
        	rem=rem*10+ld;
        	num=num/10;
        }
        if(rem==num1) {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("not palindrome");
        }
	}
}
