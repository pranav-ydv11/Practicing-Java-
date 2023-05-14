 import java.util.*;

class revarr{
	public static void main(String[]arg){
		Scanner sc=new Scanner(System.in);

		 System.out.println("enter the size of array");
		 int size =sc.nextInt();
		 int arr[]=new int[size];

		  System.out.println("enter the element of array");
		   for(int i=0; i<arr.length; i++){
		 arr[i]=sc.nextInt();
				     		    }

		    System.out.println("the reverse arr element are");
		    for(int i=0; i<arr.length; i++){
			    int rem=0;
			    int rev=0;
			    int temp=arr[i];
			    while(temp!=0){
				    rem=temp%10;
				    rev=rev*10+rem;

			    temp=temp/10;
			    }
			     System.out.println(rev);
		    }
	}
}



