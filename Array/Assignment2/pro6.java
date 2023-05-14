import java.util.*;

class common{
       	public static void main(String arr[]){
	 	Scanner sc=new Scanner(System.in);
	         System.out.println("enter the size of array1");
		 int ar1=sc.nextInt();
		 int arr1[]=new int[ar1];
		 System.out.println("enter the size of array2");													                        int ar2=sc.nextInt();
		 int arr2[]=new int[ar2];
		 System.out.println("enter the element of array1");
																		                         for(int i=0; i<arr1.length;i++){
																				
	 arr1[i]=sc.nextInt();																									                         }

																					 System.out.println("enter the element of array2");																						                                 for(int i=0; i<arr2.length;i++){
																								                                    arr2[i]=sc.nextInt();
																																                               }
																					 int arr3[]=new int[ar1+ar2];
																					   for(int i=0; i<arr2.length;i++){
																						   arr3[i]=arr1[i];
																					   }
		 for(int i=0; i<arr2.length;i++){
			 arr3[ar1+i]=arr2[i];
		 }
		 System.out.println("merged array is");
		   for(int i=0; i<arr3.length;i++){
			     System.out.println(arr3[i]);
		   }
	}
}

