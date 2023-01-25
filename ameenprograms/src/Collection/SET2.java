package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class SET2 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
        a1.add(10);
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(20);
        a1.add(30);
        System.out.println(a1);
        HashSet h1=new HashSet<>(a1);
        System.out.println(h1);
        for(Object obj:h1) {
        	System.out.println(obj);
        }
	}
}
