package Practice;

public class CountofNumbers {

	public static void main(String[] args) {
		int num=9988775;
		int count=0;
		while(num!=0) {
			int ld=num%10;
			if(ld%2==1) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}

}
