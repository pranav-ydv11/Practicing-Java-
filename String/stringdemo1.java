// In this code we can see in how many ways we can declare the array
//
// by using  System.out.println(System.identityHashCode(str1)) we can see that every string create new object which contain the address of character in ask key value.




class sdemo1{
	public static void main(String []arg){
		String str= "Core2web";// in this case SCP string constant pull is used which help to use same data that can share adderss by other same data
		  String str1= "Core2web";
		  String str3="c2w";
		String str2=new String("c2w");//here new object is created on heap becuse heap is used.
		char arr[]={'c','2','w'};

		 System.out.println(str);// in this case SCP string constant pull is used which help to use same data that can share adderss by other same data
		  System.out.println(System.identityHashCode(str));

		  //str and str1 have same address

			 System.out.println(str1);
			  System.out.println(System.identityHashCode(str1));

			  System.out.println(str2);
			   System.out.println(System.identityHashCode(str2));
			   //str2 and str3
			   //different address having same string

			    System.out.println(str3);
			     System.out.println(System.identityHashCode(str3));

			   System.out.println(arr);
			    System.out.println(System.identityHashCode(arr));
		}
	}

