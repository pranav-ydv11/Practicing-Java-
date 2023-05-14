import java.util.*;

class common{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of array1");
		 int ar1=sc.nextInt();
		 int arr1[]=new int[ar1];

		  System.out.println("enter the size of array2");
		   int ar2=sc.nextInt();
		    int arr2[]=new int[ar2];

		     
 System.out.println("enter the element of array1");
		    for(int i=0; i<arr1.length;i++){
			    arr1[i]=sc.nextInt();
		    }

		     System.out.println("enter the element of array2");
		           for(int i=0; i<arr2.length;i++){
				   arr2[i]=sc.nextInt();
			   }

			    for(int i=0; i<arr1.length;i++){
				     for(int j=0; j<arr2.length;j++){
					     if(arr1[i]==arr2[j]){
						     System.out.println("the common element between the arr is="+arr1[i]);
						    // break;
					     }
				     }
			    }
	}
}
									                         


		
