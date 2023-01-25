package Collection;

import java.util.ArrayList;

public class Ar5 {
public static void main(String[] args) {
	ArrayList<Integer>a1=new ArrayList<>();
	
	a1.add(11);
	a1.add(12);
	a1.add(13);
	a1.add(14);
	a1.add(15);
	 ArrayList<Integer>a2=new ArrayList<>();
    for(Integer i:a1) {
    	if(i%2==0) {
    		a2.add(i); 
    		
    	}
    } 
   
    System.out.println(a2);
    
}
}
