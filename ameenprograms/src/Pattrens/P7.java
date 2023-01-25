package Pattrens;

public class P7 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=3;j++) {
				if(j==1||j==3) {
					System.out.print(num+++" ");
				}
				
				else {
					System.out.print("*"+" ");
				}
				
			}
			System.out.println();
			
			
		}

	}

}
