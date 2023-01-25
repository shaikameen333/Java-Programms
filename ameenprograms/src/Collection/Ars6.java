package Collection;

import java.util.ArrayList;

public class Ars6 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add("hello");
		a1.add(true);
		a1.add(5);
		a1.add(3);
		int sum=0;
		for(int i=0;i<a1.size();i++) {
			
			try {
				Integer i1=(Integer)a1.get(i);
				sum=sum+i1;
			}
			catch (Exception e) {
			continue;
			}
		}
		System.out.println(sum);
	}

}
