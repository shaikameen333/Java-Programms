package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Mapsss {
	public static void main(String[] args) {
      HashMap h1=new HashMap<>();
      h1.put(1, "Ameen");
      h1.put(2, "hello");
      h1.put(5, "mpl");
      h1.put("harley", 33);
      h1.put(55, 96);
      h1.put(66, "bangalore");
      System.out.println(h1.size());
      
      System.out.println(h1);
      System.out.println("------------------------------------------------------------------");
      Set keys = h1.keySet();
      for(Object obj:keys) {
    	  System.out.println(obj);
      }
      System.out.println("-----------------------------------------------------------------");
      Collection values = h1.values();
      for(Object obj1:values) {
    	  System.out.println(obj1);
      }
      System.out.println("---------------------------------------------------------------------");
      Set allvalues = h1.entrySet();
      for(Object obj2:allvalues) {
    	  System.out.println(obj2);
      }
      System.out.println("--------------------------------------------------------------------------");
      HashMap<String, Integer>h2=new HashMap<>();
      h2.put("ameen",74);
      System.out.println(h2);
    	  HashMap<Integer, String>h3=new HashMap<>();
    	  h3.put(1,"ameen");
    	  System.out.println(h3);
	}
}
