import java.util.*;
class perfectNo{
	public static void main(String []arg){
	Scanner sc=new Scanner(System.in);

	 System.out.println("enter the size of array");
	 		 int size =sc.nextInt();
			 int arr[]=new int[size];

			 System.out.println("enter the element of array");
	 		   for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			     		    }

			   for(int i=0;i<arr.length;i++){
				   int sum=0;
				   for(int j=1;j<arr[i];j++){
					   if(arr[i]==0)
						   sum=sum+j;
					   
				   }
					   if(sum==arr[i]){
						   System.out.println("the perfect No in the arr is "+arr[i]+"at index "+i);
					   }
				   
			   }
	}
}


