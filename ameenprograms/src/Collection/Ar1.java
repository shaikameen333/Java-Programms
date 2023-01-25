package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ar1 {
	private static final int Object = 0;

	public static void main(String[] args) {
		int  sum=0;
		ArrayList a1=new ArrayList<>();
		a1.add(15);
		a1.add(30);
		a1.add(2);
		a1.add(10);
        System.out.println(a1);
		for(Object a2:a1) {
			int i1=(int)a2;
			sum=sum+i1;
			System.out.println(i1);
		}

		System.out.println(sum);




	}
}
