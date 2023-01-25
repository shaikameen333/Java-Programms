package collections;
import java.util.*;
public class Iterator {

	public static void main(String[] args) {
      List<String>l1=new ArrayList<String>();
      l1.add("ameen");
      l1.add("rohit");
      l1.add("shaan");
      System.out.println(l1);
       java.util.ListIterator<String>it=l1.listIterator(l1.size());
       while(it.hasPrevious()) {
    	   String name = it.previous();
    	   System.out.println(name);
    	   
      }
     
    	  
   
	}

}
