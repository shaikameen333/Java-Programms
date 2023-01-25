package Try;

public class B {
public static void main(String[] args) {
	int a=10;
	int b=0;
	try {
		System.out.println(a/b);
	}
	catch(Exception c){
		System.out.println("exception handaled");
	}
	finally {
		try {
			int d[]= {1,3,45,63,8,9};
		System.out.println(d[d.length]);	
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Ameen");
		}
		System.out.println("hello world");
	}
}
}
