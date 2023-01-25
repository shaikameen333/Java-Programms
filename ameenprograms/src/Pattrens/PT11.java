package Pattrens;

public class PT11 {

	public static void main(String[] args) {
		int num=1;
		char ch='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
	 for(int k=4;k>i;k--) {
		 System.out.print(ch+++" ");
	 }
	 System.out.println();
    
      }
	}

}
