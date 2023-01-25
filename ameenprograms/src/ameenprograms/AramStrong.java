package ameenprograms;

public class AramStrong {

	public static void main(String[] args) {
		int num=372;
		int n=num;
		int count=0;
		while(n>0){
			n=n/10;
			count++;
		}
		int temp=num;
		int sum=0;
		while(temp>0){
			int ln=temp%10;
			int ld=ln;
			int power=1;
			for(int i=1;i<=count;i++){
				power=power*ld;
			}
			sum=sum+power;
			temp=temp/10;
		}
		System.out.println(sum);
	}
}


