import java.util.*;
class arrevensum{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];

		 System.out.println("enter the element of array");
		 for(int i=0; i<arr.length;i++){
			 arr[i]=sc.nextInt();
		 }
		  System.out.println("even sum addition array");
		  int sum=0;

		 for(int i=0;i<arr.length;i++){
			 int temp=arr[i];
			 while(temp!=0){

			 int rem=temp%10;
			 sum=sum+rem;
			 temp=temp/10;
			 }
			 if(sum%2==0){
				  System.out.println(arr[i]);
			 }
			 sum=0;
		 }
	}
}



