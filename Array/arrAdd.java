//Adderess of array in different format:
class adderess{
	public static void main(String []arg){
		int arr1[]={1,2,3,4};
		int arr2[]={1,2,3,4};
		float arr3[]={1, 2, 3,4};
		 float arr4[]={1, 2, 3,4};

		//here both array having same contain but different adderess
		System.out.println(arr1);
	       System.out.println(arr2);
	       System.out.println(arr3);
	        System.out.println(arr4);




	       //but array's contained are same which internaly have same adderess(this applicable for only -128 to 127 that means only char and int)
	       System.out.println(System.identityHashCode(arr1[0]));
	        System.out.println(System.identityHashCode(arr2[0]));

		//for float this is not applicable(here data iniside is same but not have same address)
		 System.out.println(System.identityHashCode(arr3[0]));
		  System.out.println(System.identityHashCode(arr4[0]));

	}
}

