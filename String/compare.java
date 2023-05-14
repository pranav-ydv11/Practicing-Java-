import java.util.*;
class comparedemo{
	static int strcom(String str1,String str2){
	int result=0;
	char arr1[]=str1.toCharArray();
	 char arr2[]=str2.toCharArray();

	 if(arr1.length==arr2.length){
		 int c=0;

	 for(int i=0; i<arr1.length;i++){
		 int ch1=arr1[i];
		 int ch2=arr2[i];
		 

		 if(ch1!=ch2){
			 result=ch1-ch2;
			 System.out.println(result);
		 }
		 else{
			 c++;
		 }
	 }
	 if(c==arr1.length){
		 System.out.println("0");
	 }
}
else{

		   System.out.println(arr1.length-arr2.length);
}
         return result;
	 }
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	  System.out.println("enter string one");
	  String s1=sc.next();

	   System.out.println("enter string two");
	   String s2=sc.next();

	   strcom(s1,s2);
}
}




