package ameenprograms;

public class RemoveSpace {

	public static void main(String[] args) {
		String s1="my   name    ameen";
		String s2=s1.replaceAll("\\s+","");
		System.out.println(s2);
	}

}
