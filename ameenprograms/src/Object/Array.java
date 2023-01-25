package Object;

public class Array {
String name;
int rollno;
static int count=0;
Array(String name,int rollno){
	count++;
	this.name=name;
	this.rollno=rollno;
}
	public static void main(String[] args) {
		Array a1=new Array("Ameen",01);
		Array a2=new Array("Nagu",02);
		Array a3=new Array("mohammed",03);
		Array a[]=new Array[count];
		a[0]=a1;
		a[1]=a2;
		a[2]=a3;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
