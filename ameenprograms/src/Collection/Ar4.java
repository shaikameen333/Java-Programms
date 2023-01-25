package Collection;

import java.util.ArrayList;

public class Ar4 {
public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList<>();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	int sum=0;
	System.out.println();
	for(int i:a1) {
		
		sum=sum+i;
	}
	System.out.println(sum);
}
}
