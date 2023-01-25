package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		HashSet<Integer>h1=new HashSet<>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
	//	System.out.println(h1);
		ArrayList<Integer>a1=new ArrayList<>(h1);
		Collections.sort(a1);
	//	for(int i=0;i<a1.size();i++) {
		//	System.out.println(a1.get(i));
		//}
		System.out.println(a1);
		

	}

}
