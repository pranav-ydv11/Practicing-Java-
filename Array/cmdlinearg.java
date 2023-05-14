// as we see in array some no.,string, char have same address for same value in different array
class cmd{
	public static void main(String[] arg){
		int arr[]={10,20,30,40};
		System.out.println(System.identityHashCode(arr[0]));
		 System.out.println(System.identityHashCode(arr[1]));

//		  System.out.println(arg[]);
		  for(int i=0;i<arg.length;i++){
		  			 System.out.println(arg[i]);
		//  for(int i=0; i<arg.lenth; i++){
		//	  System.out.println(arg[i]);
			  System.out.println(System.identityHashCode(arg[i]));
			   // System.out.println(System.identityHashCode(arr[1]));
			  //   System.out.println(System.identityHashCode(arr[3]));
	}
	}
}	
