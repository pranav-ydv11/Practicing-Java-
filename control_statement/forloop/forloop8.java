//Armstrong no. for three digit:
/*class armstrong{
	public static void main(String arg[]){
		int n=153;
		int temp=n;
		int sum=0;
		//int rem=0;

		for(int rem=0; n!=0;){
		//	int rem=n%10;
	//	while(n!=0){
		rem=n%10;

		sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==temp){
			System.out.println("its armstrong No.");
		}
		else{
			System.out.println("its not armstrong no.");
		}
	}
}*/

import java.util.Scanner;

class armstrong{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number--");
		int N=sc.nextInt();
		//t N=153;
		int temp1=N;
		int temp2=N;
		int count=0;
		int sum=0;
		int rem=0;

		while(temp1!=0){
//			count=count+1;
			temp1=temp1/10;
			count++;
		}
//		System.out.println("Count is"+count);
	

		while(N!=0){
		rem=N%10;
		int multi=1;
		for(int i=1; i<=count; i++){
			multi=multi*rem;
		}
		sum=sum+multi;
		N=N/10;
		}
			if(temp2==sum){
				System.out.println("its armstrong no");
			}
			else{
				System.out.println("not armstrong no.");
			
			}
	}
}




