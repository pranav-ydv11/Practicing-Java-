class equalDemo{
	public static void main(String[]arg){
		String str1="Pranav";
		String str2=new String("Pranav");
		String str3="prnv";
		 System.out.println(str1.equals(str2));
		 System.out.println(str1.equalsIgnoreCase(str2));
				  System.out.println(str1.equals(str3));
	}
}
