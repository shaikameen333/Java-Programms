package Pattrens;

public class PT17 {

	public static void main(String[] args) {
		int num=1;
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(i%2==0)	{
					System.out.print(num+++" ");
					
				}
				else {
				
					System.out.print(ch+++" ");
				}
			}
			System.out.println();

			}
	}
}

