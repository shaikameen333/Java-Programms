package Collection;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TREEMAP4 {
	public static void main(String[] args) {
     TreeMap t1=new TreeMap<>();
     t1.put(1, "ameen");
     t1.put(2,"harley");
     t1.put(152, "mpl");
     System.out.println(t1);
     TreeMap t2=new TreeMap<>();
     t2.put(665, "bangalore");
     t2.put(63, "banshankri");
     t2.put(2, "katirikuppe");
     t2.put(1, "btm");
     t2.put(100, "tyss");
     System.out.println(t2);
     Set keys = t2.keySet();   
     for(Object var:keys) {
    	 System.out.println(var);
     }
     Collection values = t2.values();
     System.out.println("===========================");
     for(Object var1:values) {
    	 
    	 System.out.println(var1);
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}
}
