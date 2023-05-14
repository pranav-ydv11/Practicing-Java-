class arr{
	//public static void main(Sting[]arg){
        void fun(int[]arr){
		arr[1]=700;
		arr[2]=800;
	}
	public static void main(String[]arg){
		int arr[]={10,20,30,40};
		System.out.println(System.identityHashCode(arr[0]));
		 System.out.println(System.identityHashCode(arr[1]));
	  System.out.println(System.identityHashCode(arr[2]));
		 System.out.println(System.identityHashCode(arr[3]));
				  arr obj=new arr();
				  obj.fun(arr);
				  for(int x:arr){
					  System.out.println(x);
				  }
				   System.out.println(System.identityHashCode(arr[1]));//for value from-127 to 128 array value have same address
				    System.out.println(System.identityHashCode(arr[2]));
				 // int x=70;
				 // int y=80;
				   int x=700;
				    int y=800;
				   System.out.println(System.identityHashCode(x));
					    System.out.println(System.identityHashCode(y));
	}
	}

	


