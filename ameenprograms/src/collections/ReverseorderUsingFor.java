package collections;
import java.util.*;
public class ReverseorderUsingFor {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList ();
		a1.add(12);
		a1.add(5);
		a1.add(8);
		a1.add(19);
	    
	    int a=a1.size();
	    for(int i=a-1;i>=0;i--) {
	    	int b= a1.get(i);
	    	System.out.println(b);
	    }
	}

}