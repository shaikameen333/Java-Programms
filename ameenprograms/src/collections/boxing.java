package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class boxing {

	public static void main(String[] args) {
		
/*	ArrayList a1=new ArrayList<>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	System.out.println(a1.size());
	ArrayList a2=new ArrayList<>();
	a2.add(15);
	a2.add(36);
  	//to addAll the elements
	a1.addAll(a2);
	System.out.println(a1);
	System.out.println(a1.size());
	//to access the particular element from the array list
	System.out.println(a2.get(1));
	*/

ArrayList a1=new ArrayList<>();
	a1.add(10);
	a1.add(2);
	a1.add(300);
	// to sort the array Acending order
	Collections.sort(a1);
	System.out.println(a1);
}
}
