import java.util.*;

class que3{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];

		int div=0;

		     System.out.println("enter the value  of array");
		     for(int i=0; i<arr.length; i++){
		     arr[i]=sc.nextInt();

		     if(arr[i]%5==0){
			     div=arr[i];

		//	     System.out.println(arr[i]);
		   }
		    System.out.println(div);
		     }
		
	
	}
}

