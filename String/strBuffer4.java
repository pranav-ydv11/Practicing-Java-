class strBuf4{
	public static void main(String arg[]){
		String str1="Pranav";
		 System.out.println(System.identityHashCode(str1));
		String str2=new String("YAdav");
		StringBuffer str3=new StringBuffer("c2w");

		str1.concat(str2);// in this case object of concat is created on heap  but due to not present of reference it is then went to garbage
		 System.out.println(System.identityHashCode(str1));

		 str1=str1.concat(str2);//now it can work
		str3.append(str2);

		 System.out.println(str1);
		 System.out.println(System.identityHashCode(str1));

		 System.out.println(str2);
		  System.out.println(System.identityHashCode(str2));

		System.out.println(str3);
		 System.out.println(System.identityHashCode(str3));
	}
}
