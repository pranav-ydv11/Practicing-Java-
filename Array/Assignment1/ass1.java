import java.util.*;

class que1{
	public static void main(String [] arg){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];

		  System.out.println("enter the value of array");
		  int sum=0;
		  int multi=1;


		  for(int i=0; i<arr.length; i++){
			   arr[i]=sc.nextInt();


			  if(arr[i]%2!=0){
				  sum=sum+arr[i];
				 
				 //   System.out.println("sum of the odd arry is="+sum);
 }

                         if(i%2!=0){
				 multi=multi*arr[i];

		  }
		
		          //                             System.out.println("sum of the odd arry is="+sum);
				//		        System.out.println("product of the odd index arry is="+multi);
	}
	   System.out.println("sum of the odd arry is="+sum);
	   System.out.println("product of the odd index arry is="+multi);
	}
}

