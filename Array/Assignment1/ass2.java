import java.io.*;

class que2{
	public static void main(String[] arg)throws IOException{
		//InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the size of array");
		//int size=Integer.parseInt(br.readLine(System.in));
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int multi=1;


		 System.out.println("enter the value of array");

		 for(int i=0; i<arr.length; i++){

		   arr[i]=Integer.parseInt(br.readLine());

		   if(arr[i]%2==0){ 
			   multi=multi*arr[i];
			     //System.out.println(arr[i]*arr[i]);
		   }
		 }
		   System.out.println("multiplication of even no"+multi);"+multi);;
	}
}






		
	

