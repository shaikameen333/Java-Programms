package ameenprograms;


public class Arraysort {

	public static void main(String[] args) {
      int []a= {8,6,9,8,3,2,1,0};
      int temp=0;
      for(int i=0;i<a.length;i++) {
    	  for(int j=i+1;j<a.length;j++) {
    		  if (a[i]>a[j]) {
    			  temp=a[i];
    			  a[i]=a[j];
    			  a[j]=temp;
    		  }
    	  }
      }
         for(int i=0;i<a.length;i++) {
        	 System.out.println(a[i]);
         }
      

	}

}
