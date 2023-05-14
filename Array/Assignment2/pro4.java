import java.util.*;

class maxAndmin{
	public static void main(String[]arg){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array");
		int size =sc.nextInt();

	

		int arr[]=new int[size];

		 System.out.println("enter the element of array");
		for(int i=0; i<size;i++){
			arr[i]=sc.nextInt();
		}
	
	//	int min=arr[0];
	        int max=arr[0];
	for(int i=0; i<arr.length;i++){

		// if(min>arr[i]){
	          //      min=arr[i];
		 if(max<arr[i]){
			 max=arr[i];

	}
	}
	//	 System.out.println("the min element in the arr is"+min);
		  System.out.println("the max element in the arr is"+max);
	
}
	}





