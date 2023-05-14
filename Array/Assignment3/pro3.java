import java.util.*;
class composite{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of array");
		 int size=sc.nextInt();
		 int arr[]=new int[size];

		  System.out.println("enter the element of array");
		  for(int i=0;i<arr.length;i++)
			  arr[i]=sc.nextInt();
		  


		   for(int i=0;i<arr.length;i++){
			   int count=0;
		  for(int j=1;j*j<arr.length;j++){
			  if(arr[i]%j==0){
				  count++;
			  }
		  }
			  if(count>=2){
				 System.out.println("composite no is"+arr[i]+"found at index"+i);
			  }
		  }
		   
		 
	}
}
			 
			 


