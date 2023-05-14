import java.util.*;
class primeNo{
	public static void main(String[]arg){

		Scanner sc=new Scanner(System.in);
				 System.out.println("enter the size of array");
				 int size =sc.nextInt();
		int arr[]=new int[size];


		System.out.println("enter the element of array");
	  for(int i=0; i<arr.length; i++){
		 arr[i]=sc.nextInt();
	  }

	  for(int i=0;i<arr.length;i++){
		  int count=0;
		  if(arr[i]>=2){
			  for(int j=2;j*j<=arr[i];j++){
				  if(arr[i]%j==0)
					  count++;
				  }
				  if(count==0){
					  System.out.println("prime No. in the array is"+arr[i]+"and Index is"+i);

			  }
		  }
	  }
	  }
	}




