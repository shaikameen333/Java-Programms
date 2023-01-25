
package Pattrens;

public class PT18 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			char ch='A';
			for(int j=1;j<=i;j++) {
				if(j==i) {
				System.out.print("@"+" ");
				}
				else 
				{
					System.out.print(j+" ");
				}
			}
		
		for(int k=5;k>=i;k--) {
			System.out.print(ch+++" ");
			
		}
		System.out.println();

	}

}
}
