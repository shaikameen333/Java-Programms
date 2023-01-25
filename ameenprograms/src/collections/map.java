package collections;
import java.util.*;
import java.util.HashMap;
public class map {

	public static void main(String[] args) {
		Map<Integer, String>m1=new HashMap<>();
		m1.put(1, "ameen");
		m1.put(2, "rohhit");
		m1.put(3, "harley");
		System.out.println(m1);
        Map<Integer, String>m2=new HashMap<>();
        m2.put(4, "david");
        m2.put(5, "spiders");
        m2.put(6, "mpl");
        System.out.println(m2);
        m2.putAll(m1);
        m1.putAll(m2);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.size());//checks for the array size
        System.out.println(m1.isEmpty());//check for the array empty or not
        System.out.println(m1.containsKey(m1));//only for checks the keys
		m1.remove(2);
		System.out.println(m1);
        m1.clear();
        System.out.println(m1);
	}

}
