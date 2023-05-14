class strBuf3{
	public static void main(String []arg){
		String str1="Pranav";
		String str2=new String("Yadav");
		StringBuffer str3=new StringBuffer("c2w");

	//	String str4=str1.append(str3); string  not contain append function
	//	String str4=str1.concat(str3);string cannot concat stringbuffer as it require only string 
	
		StringBuffer str4=str3.append(str1);//String buffer can append any string and stringBuffer.

		System.out.println(str1);
		 System.out.println(str2);
		  System.out.println(str3);
		   System.out.println(str4);
	}
}

