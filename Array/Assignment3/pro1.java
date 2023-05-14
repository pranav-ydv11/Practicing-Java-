import java.util.*;
class countelement{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of array");
		 int size=sc.nextInt();
		 int arr[]=new int[size];

		  System.out.println("enter the element of array");
		  for(int i=0; i<arr.length; i++){
			  arr[i]=sc.nextInt();
		  }
		   for(int i=0; i<arr.length; i++){
			   int cnt=0;
			   int temp=arr[i];
			   while(temp!=0){
				   temp=temp/10;
				   cnt++;
			   }
			     System.out.println("the element count of array"+arr[i]+"="+cnt);
		   }
	}
}
