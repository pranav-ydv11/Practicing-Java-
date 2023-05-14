//this is used to show that when array is pass it send address to static fun 
//that why when array change at one place get changed at other 

class arradd{
	static void fun(int arr[]){
		for(int x:arr){
			 System.out.println(x);
			 System.out.println(arr); 
			  
		}
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]+50;
		}
	}
	public static void main(String []arg){
		int arr[]={50,100,150};
		 System.out.println(arr);
		fun(arr);
		for(int x:arr){
			 System.out.println(x);
			  
		}
		 System.out.println(arr);
	}
}


