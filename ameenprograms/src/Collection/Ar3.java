package Collection;

import java.util.ArrayList;

public class Ar3 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList<>();
	a1.add(10);
	a1.add(20);
	a1.add(30.5);
	a1.add(50);
	a1.add("Hello");
	for(Object i:a1) {
		System.out.println(i);
	}
}
}
