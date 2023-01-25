package Pattrens;

public class PT21 {
	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||j==i||i==6) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(num+++" ");
				}
			}
			System.out.println();
		}

	}
}
