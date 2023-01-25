package Practice;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int size=sc.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("enter the numbers");
      for(int j=0;j<arr.length;j++) {
    	  System.out.println(arr[j]);
      }
	//	int arr[]= {99,3,77,108,907,22};
      //	for(int i=0;i<arr.length;i++) {
	
	//  for(int j=i+1;j<arr.length;j++) {
//		  if(arr[i]>arr[j]) {
		//	  int temp=arr[i];
	//		  arr[i]=arr[j];
//			  arr[j]=temp;
	//	  }
	//  }
//	}
//	for(int a=0;a<arr.length;a++) {
//		System.out.println(arr[a]);
	//}
	}

}
