package collections;
import java.util.*;
import java.util.Set;
public class map2 {

	public static void main(String[] args) {
      Map<Integer, String>m1=new HashMap<>();
      m1.put(1, "ameen");
      m1.put(2, "harley");
      m1.put(3, "facebook");
      m1.put(4, "whatsup");
      m1.put(1,"mpl");
     Collection<String> m = m1.values();
     
	for(Object m2:m) {
    	 System.out.println(m2);
     }
      
	}

}
