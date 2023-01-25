package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ARiterator {
	public static void main(String[] args) {
     ArrayList a1=new ArrayList<>();
     a1.add(10);
     a1.add(20);
     a1.add(5);
     a1.add("hello");
     a1.add(true);
     Iterator i1=a1.iterator();
     while(i1.hasNext()) {
    	 System.out.println(i1.next());
     }
	}
}
