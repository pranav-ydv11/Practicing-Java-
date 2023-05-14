import java.util.*;


class index{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);

		  System.out.println("enter the size of array");
		  int size =sc.nextInt();
		  int arr[]=new int[size];

		    System.out.println("enter the value to array");
		    for(int i=0; i<arr.length; i++){
			     arr[i]=sc.nextInt();
		    }
		      System.out.println("the array to search it index");
		      int search=sc.nextInt();

			      for(int i=0; i<arr.length; i++){
			      System.out.println(arr[i]);
//			      int search=sc.nextInt();
			      if(search==arr[i]){
				        System.out.println("the index of arr is="+i);
		    }
			      }
		   // int search=sc.nextInt();
		    }
	}


