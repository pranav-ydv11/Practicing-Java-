class strBufMethod{
	        public static void main(String []arg){
//append

StringBuffer sb =new StringBuffer("pranav");
/*sb.append("yadav");
System.out.println(sb);


//Delete
sb.delete(2,6);
System.out.println(sb);*/

//Reverse
//System.out.println(sb.reverse());

// String cannot directly reverse, by using StringBufferd it can be reversed

String str="Core2web";
StringBuffer sb2 =new StringBuffer(str);
str= sb2.reverse().toString();

System.out.println(str);

 




















		}
}


