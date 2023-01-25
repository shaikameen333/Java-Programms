package Pattrens;

public class P5 {

	public static void main(String[] args) {
		char ch='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j==3) {
				System.out.print(" "+ch++);
				}
				else {
					System.out.print(" _");
				}
			}
			System.out.println();
		}

	}

}
