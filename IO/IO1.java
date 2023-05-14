//input using java>>>
//
import java.util.*;
/*
class io{
	public static void main(String[]arg){
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the name && age && salary");

	        String Name=obj.next();
		int age=obj.nextInt();
		float salary=obj.nextFloat();


		System.out.println("name--" +Name);
          	System.out.println("Age--" +age);
		System.out.println("Salary--"+salary);

	}
}*/

class tokenizer{
	public static void main(String[]arg){
		Scanner obj=new Scanner(System.in);
			System.out.println("Your name, Age, Divsion, BOD");

			String info=obj.nextLine();
			
			StringTokenizer obj1=new StringTokenizer(info," ");

			String token1=obj.nextToken();
			String token2=obj.nextToken();
			String token3=obj.nextToken();
			String token4=obj.nextToken();

			System.out.println("Your name "+token1);
			 System.out.println("Your name "+token2);
			  System.out.println("Your name "+token3);
			   System.out.println("Your name "+token4);
		}
	}



