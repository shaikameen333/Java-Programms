package Practice;

public class A {

	public static void main(String[] args) {
		int arr[]= {1,9,3,7,66,99,12,75,0};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[1]);
			
		}
	}
}