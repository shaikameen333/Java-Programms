package ameenprograms;

public class febonice {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		//	System.out.println("enter the Range");//
		//	int a=sc.nextInt();//
			int f1;
			int f2=0;
			int f3=1;
			for (int i=1;i<=10;i++) {
				System.out.print(f3  +" ");
				f1=f2;
				f2=f3;
				f3=f1 +f2;
				if(f3>25) {
					break;
				}
			}
		}
	

	}


