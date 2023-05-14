// different ways to declare the arry
class arr{
	public static void main(String arg[]){
		int[] arr1={6,5,4 };
//int arr[]=new int[5]{1,1,1,1,1};   error because both length and data must not declared at a time
                int arr2[]=new int[]{1,2,3,4};

		int arr3[]=new int[4];
		arr3[0]=10;
		  arr3[1]=20;
		   arr3[2]=30;
		    arr3[3]=40;


		System.out.println(arr1[0]+ " " +arr1.length);
		  System.out.println(arr2[0]+ " " +arr2.length);
		    System.out.println(arr3[0]+ " " +arr3.length);
	}
}
