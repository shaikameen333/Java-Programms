package Practice;

import java.util.Scanner;

public class Strong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int num1=num;
	int sum=0;
	while(num!=0) {
		int ld=num%10;
		int fact=1;
		for(int i=1;i<=ld;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
	}
	if(num1==sum) {
		System.out.println("Given number is Strong");
	}
	else {
		System.out.println("Given number is Integer ");
	}
}

}
