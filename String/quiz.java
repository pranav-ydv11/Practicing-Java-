class c2w{
	public static void main(String arg[]){
	/*	String str1=new String("java");
		  String str2="java";

		  System.out.println(str1==str2);

		String str="core";
       str=	str.concat("web");
		  System.out.println(str.length());


		int arr[]={97,98,99,100};
		String str=new String(arr);
		System.out.println(str);*/


		 String str1=new String("java");
		  String str2=new String("java");

		 if(str1==str2) 
			  System.out.println("True 1");
		 if(str1.equals(str2))
			  System.out.println("True 2");
		 if(str1.hashCode()==str2.hashCode())
			  System.out.println("True3");

	}
}

