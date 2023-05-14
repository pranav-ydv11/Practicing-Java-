import java.util.*;

import java.io.*;

class arrin{
	public static void main(String arg[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

	//	Scanner sc=new Scanner(System.in);

		System.out.println("enter the size of array you want");
	//	int A=sc.nextInt();
	         int A=Integer.parseInt(br.readLine());


		int arr[]=new int[A];

//System.out.println("enter the Contain of arrAY");

		for(int i=0; i<A; i++){
			 System.out.println("enter the Contain of arrAY");
		//	 arr[i]=sc.nextInt();
		          arr[i]=Integer.parseInt(br.readLine());
		}

		for(int x=0; x<A; x++){
			System.out.println(arr[x]);
		}
	}
}

