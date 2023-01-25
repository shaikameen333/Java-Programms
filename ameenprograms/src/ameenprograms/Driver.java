package ameenprograms;

public class Driver {

	public static void main(String[] args) {
		int num=121;
		int a=num;
		int sum=0;
		for (int i=0;i>a;i++){
		 int rem=i%10;
		sum=sum*10+rem;
		num=num/10;
             }
	
	if(a==sum) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not ");
	}
	}
}
	
