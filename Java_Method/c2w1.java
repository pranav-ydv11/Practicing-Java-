import java.util.*;
 class methDemo{
	static void mathematical(int a, int b){
	int ans = a+b;
	int multi=a*b;
	int sub=a-b;
	int div=a/b;
        System.out.println(ans);
	System.out.println(sub);
	System.out.println(multi);
	System.out.println(div);


	}
	public static void main(String[]arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter int valur");
		int a=sc.nextInt();
		int b=sc.nextInt();
		mathematical(a,b);
		
	}
}

