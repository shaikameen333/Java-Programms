package Pattrens;

public class PT19 {
public static void main(String[] args) {
	char ch='A';
	int num=1;
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			if(j==1||j==i) {
			if(i%2==0){
				System.out.print(num+++" ");
			}
			else{
			System.out.print(ch+++" ");
			}
			}
			else
			{
				System.out.print("*"+" ");
			}
			}
		
		System.out.println();
	}
}
}
