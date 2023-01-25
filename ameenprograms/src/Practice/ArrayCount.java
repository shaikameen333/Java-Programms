package Practice;

public class ArrayCount {

	public static void main(String[] args) {
    int arr[]= {23,26,59,65,77,99,88,102};
    int count=0;
    for(int i=0;i<arr.length;i++) {
    	int ld=arr[i]%10;
    	if(ld%3==0) {
    		count++;
    		
    	}
    	arr[i]=arr[i]/10;
    }
    System.out.println(count);

	}

}
