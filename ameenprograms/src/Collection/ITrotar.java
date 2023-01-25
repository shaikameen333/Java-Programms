package Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class ITrotar {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(5);
		a1.add("hello");
		a1.add(true);
		a1.add(5);
		int sum=0;
		Iterator i1=a1.iterator();
		System.out.println(a1);
		while(i1.hasNext()) {
			try {
				int a2=(int)i1.next();
				System.out.println(a2);
				sum=sum+a2;
			}
			catch(Exception e){
				continue;
			}
		}
		System.out.println("sum of numbers:"+sum);
	}
}
