package ameenprograms;

public class Factoria {
	public void fact(int num)
	{
		int fact=1;
		for(int i=1;i<=5;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Factoria f1=new Factoria();
		 f1.fact(5);

	}

}
