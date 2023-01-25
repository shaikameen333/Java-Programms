package Pattrens;

public class PT22 {

	public static void main(String[] args) {
		int num=1;
		char ch='A';
		char ch1='a';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				if(i==2) {
					System.out.print(ch+++" ");
				}
				else if(i==3){
					System.out.print(ch1+++" ");
				}
				else {
					System.out.print(num+++" ");
				}
			}
			System.out.println();
		}
	}
}

