import java.util.*;

class arrsum{
	public static void main(String[]arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");

		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		System.out.println("enter the value to array");
		for(int i=0; i<arr.length; i++){
		  arr[i]=sc.nextInt();
		  sum=sum+arr[i];
		}

		    for(int i=0; i<arr.length; i++){
		  System.out.println(arr[i]);
	}
	// System.out.println(arr[i]);
	System.out.println(sum);
	}
}


