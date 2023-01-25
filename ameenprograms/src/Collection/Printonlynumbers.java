package Collection;

import java.util.ArrayList;

public class Printonlynumbers {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add("hello");
		a1.add(true);
		a1.add(5);
		int sum=0;
		for(Object i:a1) {
			try {
			int i1=(int)i;
			sum=sum+i1;
			System.out.println(i1);
			}
			catch(Exception e) {
				continue;
			}

			
		}
		System.out.println(sum);
		


	}
}
